/**
 * Lab05: Sistema P2P
 * 
 * Autor: Lucio A. Rocha
 * Ultima atualizacao: 22/05/2023
 * 
 * Referencias:
 * https://docs.oracle.com/javase/tutorial/essential/io
 * http://fortunes.cat-v.org/
 * 
 * DUPLA: ERIK NODA E THIAGO BERTO MINSON
 * 
 * IMPLEMENTACAO ITEM 1)
 * Modificacoes:
 * // ADICIONANDO UM NOVO PEER
 * PEER4 {
 * public String getNome() {
 * return "PEER4";
 * }
 * };
 */

public enum PeerLista {

    PEER1 {
        @Override
        public String getNome() {
            return "PEER1";
        }
    },
    PEER2 {
        public String getNome() {
            return "PEER2";
        }
    },
    PEER3 {
        public String getNome() {
            return "PEER3";
        }
    },
    // ADICIONANDO UM NOVO PEER
    PEER4 {
        public String getNome() {
            return "PEER4";
        }
    };

    public String getNome() {
        return "NULO";
    }
}
