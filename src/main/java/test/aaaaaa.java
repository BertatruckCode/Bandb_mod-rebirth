/*
import net.minecraft.client.Minecraft;

//part 1
			tessellator.addVertexWithUV(x + 0, y + 0  , z + 0, 0, 0); //Bottom left texture
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[1], y + cut[1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[1], 1, 1);
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[1], y + cut[1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[1], 0, 1);
			tessellator.addVertexWithUV(x + 0, y + 0  , z + 0, 1, 0); //Bottom right
	
			
			//part 2
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[1], y + cut[1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[1], 0, 0);			
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[2], y + cut[2], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[2], 1, 1); //Top right
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[2], y + cut[2], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[2], 0, 1); //Top left						
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[1], y + cut[1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[1], 1, 0);

			//part 3
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[2], y + cut[2], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[2], 0, 0); //Top right			
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[3], y + cut[3], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[3], 1, 1); //Top right
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[3], y + cut[3], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[3], 0, 1); //Top right		
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[2], y + cut[2], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[2], 1, 0); //Top left						

			
			//part 4
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[3], y + cut[3], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[3], 0, 0); //Top right
			tessellator.addVertexWithUV(x + 0, y + cut[4]  , z + 0, 1, 1); 
			tessellator.addVertexWithUV(x + 0, y + cut[4]  , z + 0, 0, 1); 			
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[3], y + cut[3], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[3], 1, 0); //Top right		
			
			
			tessellator.draw();
*/