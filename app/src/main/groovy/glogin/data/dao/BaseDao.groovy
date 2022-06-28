package glogin.data.dao

import groovy.sql.GroovyRowResult
import groovy.sql.Sql

trait BaseDao<T,ID extends Object> {
    Sql cnn
    String nemaTable
    List<T> getAll(){
        List<T> rows=new LinkedList<T>()
        cnn.rows("Select * from $nameTable").each {row ->
            rows.add(converTo(row))}
        rows
    }

    T getOne(ID id){
        converTo(cnn.firstRow("Select * from $nameTable WHERE id $id"))
    }
    abstract T converTO(GroovyRowResult rs)
}