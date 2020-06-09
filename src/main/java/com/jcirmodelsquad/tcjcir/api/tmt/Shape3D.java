package com.jcirmodelsquad.tcjcir.api.tmt;

public class Shape3D {
	
	public PositionTransformVertex[] vertices;
	public TexturedPolygon[] faces;
	
	public Shape3D(PositionTransformVertex[] verts, TexturedPolygon[] poly){
		vertices = verts;
		faces = poly;
	}
	
}
