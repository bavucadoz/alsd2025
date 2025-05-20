package doublelinkedlist;

public class NodeFilm {
    Film data;
    NodeFilm prev, next;

    public NodeFilm(NodeFilm prev, Film data, NodeFilm next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}