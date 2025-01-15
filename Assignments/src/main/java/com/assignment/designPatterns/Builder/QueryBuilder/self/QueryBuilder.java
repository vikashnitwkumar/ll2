package main.java.com.assignment.designPatterns.Builder.QueryBuilder.self;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder(Buider buider) {
        this.select = buider.select;
        this.from = buider.from;
        this.where = buider.where;
        this.join = buider.join;
        this.orderBy = buider.orderBy;
        this.groupBy = buider.groupBy;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join = join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }
    public static  Buider getBuilder(){
        return new Buider();
    }
    public static class Buider{
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public Buider setSelect(String select) {
            this.select = select;
            return this;
        }

        public Buider setFrom(String from) {
            this.from = from;
            return this;
        }

        public Buider setWhere(String where) {
            this.where = where;
            return this;
        }

        public Buider setJoin(String join) {
            this.join = join;
            return this;
        }

        public Buider setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Buider setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public QueryBuilder build(){
            return new QueryBuilder(this);
        }
    }
}