;example usage
Graphics 640,480,16,2
SetBuffer BackBuffer()

; Grid const
Const stpx%=20
Const stpy%=20

; Grid position and width/height
Global gridx%=30
Global gridy%=50

Global gridw%=610
Global gridh%=410

; Used to know the array X/Y index and how many index are under the array
Global arrayx%=1
Global arrayy%=1

Global arrayw%=(gridw-gridx)/stpx
Global arrayh%=(gridh-gridy)/stpy

While Not KeyHit(1)
	Cls
	
	RefreshGrid()
	
	Text 0,30,arrayx+" / "+arrayy+" / Array xy index number : "+arrayw+","+arrayh
	
	Flip
	
Wend


Function RefreshGrid()
	mx=MouseX()
	my=MouseY()
	
	For x=gridx To gridw-1 Step stpx
		
		
		For y=gridy To gridh-1 Step stpy
			
			
			If Mx>X And Mx<X+stpx And My>Y And My<Y+stpy Then
				
				Color 255,255,255
				Rect x,y,stpx,stpy
				
				arrayx=1+(x-gridx)/stpx
				arrayy=1+(y-gridy)/stpy
				
			EndIf
			
		Next
		
	Next
	
	RedrawGrid(gridx,gridw,gridy,gridh,stpx,stpy)
	
End Function

Function RedrawGrid(minx,maxx,miny,maxy,width,height)
	Color 150,150,150
	
	x=minx
	
	While x<=maxx
		Line x,miny,x,maxy
		x=x+width
	Wend
	
	y=miny
	
	While y<=maxy
		Line minx,y,maxx,y
		y=y+height
	Wend
	
End Function

;~IDEal Editor Parameters:
;~C#Blitz3D