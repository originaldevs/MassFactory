package archivefactory;

import Interfaces.IArchive;
import archivefactory.archivetype.ClientCSV;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchiveGenerator {

    public void executar(String separador,int linhas,String path ){
        IArchive archive = new ClientCSV();
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(path))){
            for (int i = 0; i < linhas; i++) {
                escritor.write(archive.execute(separador));
                escritor.newLine();
            }        
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }    
}