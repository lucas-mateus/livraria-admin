package models;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, BigDecimal> preco;
	public static volatile SingularAttribute<Livro, String> isbn;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, String> dataPublicacao;
	public static volatile SingularAttribute<Livro, String> descricao;

	public static final String PRECO = "preco";
	public static final String ISBN = "isbn";
	public static final String TITULO = "titulo";
	public static final String DATA_PUBLICACAO = "dataPublicacao";
	public static final String DESCRICAO = "descricao";

}

