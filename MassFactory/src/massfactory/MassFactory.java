package massfactory;

import archivefactory.ArchiveGenerator;

public class MassFactory {

    public static void main(String[] args) {
        ArchiveGenerator archive = new ArchiveGenerator();
        archive.executar(";", 100000,"src\\Source\\ArquivoTeste.txt");
    }
    
}
