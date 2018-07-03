package rmi;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.List;

import rmi_base.Aluno;
import rmi_base.EPRMI;
import rmi_base.Resultado;
import rmi_base.Turma;
import servidor.Procedures;

public class Server implements EPRMI{
	
	public Server() {}
	


	@Override
	public void testVoid() throws RemoteException {
		return;
	}



	@Override
	public long testLong(long valor) throws RemoteException {
		return Procedures.longRequest(valor);
	}



	@Override
	public long testEightLong(long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8)
			throws RemoteException {
		return Procedures.eightLongRequest(v1, v2, v3, v4, v5, v6, v7, v8);
	}



	@Override
	public long testEightLongArray(List<Long> lista) throws RemoteException {
		return Procedures.eightLongArrayRequest(lista);
	}



	@Override
	public String testStringLength(String s) throws RemoteException {
		return Procedures.testStringLenghtRequest(s);
	}



	@Override
	public Resultado testComplexType(Turma t) throws RemoteException {
		return Procedures.testComplex(t);
	}



	@Override
	public Collection<Aluno> testRemoteCollection(Collection<Aluno> col) throws RemoteException {
		return Procedures.testCollections(col);
	}



	@Override
	public void testManyArguments(int num, long num2, float num3, double num4, boolean boole, String str, int num7,
			long num8, float num9, double num10, boolean boole2, String str2, int num13, long num14, float num15,
			double num16, boolean boole3, String str3, int num19, long num20, float num21, double num22, boolean boole4,
			String str4, int num25, long num26, float num27, double num28, boolean boole5, String str5, int num31,
			long num32, float num33, double num34, boolean boole6, String str6, Aluno aluno) throws RemoteException {
		Procedures.testManyArguments();
	}



	@Override
	public void testException() throws RemoteException {
		Procedures.testException();
	}

}
