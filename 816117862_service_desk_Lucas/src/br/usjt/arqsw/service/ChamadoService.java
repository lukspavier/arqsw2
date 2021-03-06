package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

//TODO  Fa�a o ChamadoService na package servisse com um m�todo para listar os chamados 
//      recebendo como par�metro um objeto Fila

/**
 * 
 * @author Lucas Spavier 816117862 SI3AN MCA
 *
 */

@Service
public class ChamadoService {		
	private ChamadoDAO dao;
		
	@Autowired
	public ChamadoService(ChamadoDAO dao){
		this.dao = dao;
	}
	
	public int criarChamado(Chamado chamado) throws IOException{
				
		chamado.setStatus(Chamado.ABERTO);
		chamado.setDT_ABERTURA(new Date());
		chamado.setDT_FECHAMENTO(null);

		return dao.criarChamado(chamado);
	}
	
	
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
		
		ArrayList<Chamado> listaChamados = new ArrayList<>();								
		listaChamados = dao.listarChamados(fila);			
		return listaChamados;					 
					
	}
	
	}

	
	

