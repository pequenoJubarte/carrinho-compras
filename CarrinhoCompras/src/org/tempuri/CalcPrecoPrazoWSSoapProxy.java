package org.tempuri;

public class CalcPrecoPrazoWSSoapProxy implements org.tempuri.CalcPrecoPrazoWSSoap {
  private String _endpoint = null;
  private org.tempuri.CalcPrecoPrazoWSSoap calcPrecoPrazoWSSoap = null;
  
  public CalcPrecoPrazoWSSoapProxy() {
    _initCalcPrecoPrazoWSSoapProxy();
  }
  
  public CalcPrecoPrazoWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcPrecoPrazoWSSoapProxy();
  }
  
  private void _initCalcPrecoPrazoWSSoapProxy() {
    try {
      calcPrecoPrazoWSSoap = (new org.tempuri.CalcPrecoPrazoWSLocator()).getCalcPrecoPrazoWSSoap();
      if (calcPrecoPrazoWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcPrecoPrazoWSSoap != null)
      ((javax.xml.rpc.Stub)calcPrecoPrazoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CalcPrecoPrazoWSSoap getCalcPrecoPrazoWSSoap() {
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap;
  }
  
  public org.tempuri.CResultado calcPrecoPrazo(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, double nVlComprimento, double nVlAltura, double nVlLargura, double nVlDiametro, String sCdMaoPropria, double nVlValorDeclarado, String sCdAvisoRecebimento) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazo(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
  }
  
  public org.tempuri.CResultado calcPrecoPrazoData(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, double nVlComprimento, double nVlAltura, double nVlLargura, double nVlDiametro, String sCdMaoPropria, double nVlValorDeclarado, String sCdAvisoRecebimento, String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazoData(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public org.tempuri.CResultado calcPrecoPrazoRestricao(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, double nVlComprimento, double nVlAltura, double nVlLargura, double nVlDiametro, String sCdMaoPropria, double nVlValorDeclarado, String sCdAvisoRecebimento, String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoPrazoRestricao(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public org.tempuri.CResultado calcPreco(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, double nVlComprimento, double nVlAltura, double nVlLargura, double nVlDiametro, String sCdMaoPropria, double nVlValorDeclarado, String sCdAvisoRecebimento) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPreco(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
  }
  
  public org.tempuri.CResultado calcPrecoData(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino, String nVlPeso, int nCdFormato, double nVlComprimento, double nVlAltura, double nVlLargura, double nVlDiametro, String sCdMaoPropria, double nVlValorDeclarado, String sCdAvisoRecebimento, String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoData(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura, nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento, sDtCalculo);
  }
  
  public org.tempuri.CResultado calcPrazo(String nCdServico, String sCepOrigem, String sCepDestino) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazo(nCdServico, sCepOrigem, sCepDestino);
  }
  
  public org.tempuri.CResultado calcPrazoData(String nCdServico, String sCepOrigem, String sCepDestino, String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazoData(nCdServico, sCepOrigem, sCepDestino, sDtCalculo);
  }
  
  public org.tempuri.CResultado calcPrazoRestricao(String nCdServico, String sCepOrigem, String sCepDestino, String sDtCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrazoRestricao(nCdServico, sCepOrigem, sCepDestino, sDtCalculo);
  }
  
  public org.tempuri.CResultado calcPrecoFAC(String nCdServico, String nVlPeso, String strDataCalculo) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcPrecoFAC(nCdServico, nVlPeso, strDataCalculo);
  }
  
  public org.tempuri.CResultadoObjeto calcDataMaxima(String codigoObjeto) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.calcDataMaxima(codigoObjeto);
  }
  
  public org.tempuri.CResultadoServicos listaServicos() throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.listaServicos();
  }
  
  public org.tempuri.CResultadoServicos listaServicosSTAR() throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.listaServicosSTAR();
  }
  
  public org.tempuri.CResultadoModal verificaModal(String nCdServico, String sCepOrigem, String sCepDestino) throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.verificaModal(nCdServico, sCepOrigem, sCepDestino);
  }
  
  public org.tempuri.Versao getVersao() throws java.rmi.RemoteException{
    if (calcPrecoPrazoWSSoap == null)
      _initCalcPrecoPrazoWSSoapProxy();
    return calcPrecoPrazoWSSoap.getVersao();
  }
  
  
}