package glogin.data.model

class AccessModule implements Identifier<Integer>,Status{
    Integer idPrivilege
    Integer idModule
    Byte read
    Byte write
    Byte rDelete
}
