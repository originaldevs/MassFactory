package archivefactory.archivetype;

import Interfaces.IArchive;
import UtilsClass.Cpf;
import UtilsClass.DataNascimento;
import UtilsClass.EstadoCivil;
import UtilsClass.Nome;
import UtilsClass.Telefone;

public class ClientCSV implements IArchive{
    
    public String execute(String separador){
        return Nome.getNome()+separador+
                Cpf.getCpf()+separador+
                DataNascimento.getDate(18, 80)+separador+
                EstadoCivil.getEstadoCivil()+separador+
                Telefone.getTelefone()+separador;
    }   
}
