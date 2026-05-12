import java.util.Set;

public class Notebook extends Eletronico {

    private String processador;
    private Integer memoriaGb;
    private Integer armazenamentoGb;
    private Integer bateriaMAh;
    private Double telaPol;
    private String tipoPlacaVideo;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        if(processador.trim().isEmpty()) {
            throw new IllegalArgumentException("O processador deve ser preenchido.");
        }
        this.processador = processador;
    }

    public Integer getMemoriaGb() {
        return memoriaGb;
    }

    public void setMemoriaGb(Integer memoriaGb) {
        if(memoriaGb <= 0) {
            throw new IllegalArgumentException("A quantidade de memória deve ser preenchida.");
        }
        this.memoriaGb = memoriaGb;
    }

    public Integer getArmazenamentoGb() {
        return armazenamentoGb;
    }

    public void setArmazenamentoGb(Integer armazenamentoGb) {
        if(armazenamentoGb <= 0) {
            throw new IllegalArgumentException("A quantidade de armazenamento deve ser preenchida.");
        }
        this.armazenamentoGb = armazenamentoGb;
    }

    public Integer getBateriaMAh() {
        return bateriaMAh;
    }

    public void setBateriaMAh(Integer bateriaMAh) {
        if(bateriaMAh <= 0) {
            throw new IllegalArgumentException("A capacidade da bateria deve ser preenchida.");
        }
        this.bateriaMAh = bateriaMAh;
    }

    public Double getTelaPol() {
        if(telaPol <= 0) {
            throw new IllegalArgumentException("O tamanho da tela deve ser preenchido.");
        }
        return telaPol;
    }

    public void setTelaPol(Double telaPol) {
        this.telaPol = telaPol;
    }

    public String getTipoPlacaVideo() {
        return tipoPlacaVideo;
    }

    public void setTipoPlacaVideo(String tipoPlacaVideo) {
        if(tipoPlacaVideo.compareTo("integrada") != 0 && tipoPlacaVideo.compareTo("dedicada") != 0) {
            throw new IllegalArgumentException("O tipo da placa de vídeo deve ser 'integrada' ou 'dedicada'.");
        }
        this.tipoPlacaVideo = tipoPlacaVideo;
    }
}
