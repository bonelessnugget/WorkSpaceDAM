package principal;
/* El chorro verión final, alfa,beta,charlie,delta,
 * echo,foxtrot,golf,hotel,india,juliet,kilo
 * lima,mike,november,oscar,papa,quebec,romero,sierra
 * tango,uniform,victor,wiskey,x-ray,yankee,zulu.
 * Autor Daniel Paun con la colaboración de Youtube Music
 * y tutoriales de YouTube.
 * Fecha 27-10-2021
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

	public static void main(String[] args) {
	JFrame frame1 = new JFrame();
	frame1.setTitle("El Chorro Definitivo");
	frame1.setSize(500,500);
	frame1.setVisible(true);
	frame1.setLayout(new GridLayout(3,3));
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.add(new JLabel("<html>Reportero: ¿Que le puede contar a la gente que nunca <br> ha tenido un arma en su mano?</html>"));
	frame1.add(new JButton());
	frame1.add(new JButton());
	frame1.add(new JLabel("<html>ElBicho: Un arma es una máquina de hacer agujeros,<br> y la he usado para construir muebles</html>"));
	frame1.add(new JButton());
	frame1.add(new JButton());
	frame1.add(new JLabel("<html>ElBicho: En vez de usar el taladro que me cansaba mucho,<br> agarraba la carabina .22, le metia un tiro y despues atrás el tornillo a la madera, andaba bárbaro.</html>"));
	frame1.add(new JButton());
	JButton siguiente = new JButton("Siguiente");
	frame1.add(siguiente);
	siguiente.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame1.setVisible(false);
			ParteDoi();
			
		}

		private void ParteDoi() {
			JFrame frame2 = new JFrame();
			frame2.setTitle("El Chorro Definitivo");
			frame2.setSize(500,500);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.setVisible(true);
			frame2.setLayout(new GridLayout(3,3));
			frame2.add(new JLabel("<html>Reportero: ¿Y su mujer <br> que decía?</html>"));
			frame2.add(new JButton());
			frame2.add(new JButton());
			frame2.add(new JLabel("<html>ElBicho:Salio corriendo,volvio a la noche, <br> pero eso es otra ventaja, es un plus</html>"));
			frame2.add(new JButton());
			frame2.add(new JButton());
			frame2.add(new JButton());
			JButton comenzar = new JButton("Comenzar");
			frame2.add(comenzar);
			frame2.add(new JButton());
			comenzar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame2.setVisible(false);
					ParteTrei();
					
				}

				private void ParteTrei() {
					JFrame frame3 = new JFrame();
					frame3.setTitle("El Chorro Definitivo");
					frame3.setSize(500,500);
					frame3.setVisible(true);
					frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame3.setLayout(new GridLayout(3,3));
					frame3.add(new JLabel("<html>Reportero: Si le entran a su casa hoy, <br> ¿cómo se defendería?</html>"));
					frame3.add(new JButton());
					frame3.add(new JButton());
					JButton patio = new JButton("<html>Lo amasijas en <br>el patio</html>");
					frame3.add(patio);
					frame3.add(new JButton());
					JButton recondito = new JButton("<html>Lo llevas al lugar<br> más recondito de la casa</html>");
					frame3.add(recondito);
					frame3.add(new JButton());
					frame3.add(new JButton());
					frame3.add(new JButton());
					recondito.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							frame3.setVisible(false);
							JFrame frame5 = new JFrame();
							frame5.setVisible(true);
							frame5.setSize(500,500);
							frame5.setTitle("El Chotto Definitivo");
							frame5.setLayout(new GridLayout(3,3));
							frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame5.add(new JLabel("Donde lo amasijas ahora: "));
							frame5.add(new JButton());
							frame5.add(new JButton());
							JButton primerDormitorio = new JButton("En el primer dormitorio");
							frame5.add(primerDormitorio);
							frame5.add(new JButton());
							JButton sotano = new JButton("<html>En el sótano,<br> bien escondido</html>");
							frame5.add(sotano);
							frame5.add(new JButton());
							frame5.add(new JButton());
							frame5.add(new JButton());
							sotano.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									frame5.setVisible(false);
									JFrame frame7 = new JFrame();
									frame7.setVisible(true);
									frame7.setSize(500,500);
									frame7.setLayout(new GridLayout(3,3));
									frame7.setTitle("El Chorro Definitivo");
									frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									frame7.add(new JLabel("<html>Una vez en el sótano, <br> lo reventas a balasos, <br>le tiras todos los tiros.</html>"));
									frame7.add(new JButton());
									frame7.add(new JButton("<html>Consejo: No le tires solo un tiro <br> porque vas a ser hábil tirador<br> y te comes un garron de la gran flauta.</html>"));
									frame7.add(new JButton("<html>Entras en un estado de emocion violenta<br> y lcura, qué haces:</html>"));
									frame7.add(new JButton());
									frame7.add(new JButton());
									JButton arriba = new JButton("<html>Lo zapateas arriba<br> y lo meas</html>");
									frame7.add(arriba);
									frame7.add(new JButton());
									JButton abajo = new JButton("<html>Lo zapateas abajo<br> y no lo meas</html>");
									frame7.add(abajo);
									arriba.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											frame7.setVisible(false);
											JFrame frame9 = new JFrame();
											frame9.setTitle("El Chorro Definitivo");
											frame9.setVisible(true);
											frame9.setSize(500,500);
											frame9.setLayout(new GridLayout(3,3));
											frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											frame9.add(new JLabel("<html>Para demostrar tu estado de <br>locura que haces:</html>"));
											frame9.add(new JButton());
											frame9.add(new JButton());
											frame9.add(new JButton());
											frame9.add(new JButton());
											frame9.add(new JButton());
											JButton papoteas = new JButton("<html>Te papoteas un <br>sobre de cocaina.</html>");
											frame9.add(papoteas);
											JButton noPapoteas = new JButton("No papoteas nada");
											frame9.add(new JButton());
											frame9.add(noPapoteas);
											papoteas.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent e) {
													frame9.setVisible(false);
													JFrame frame11 = new JFrame();
													frame11.setVisible(true);
													frame11.setSize(500,500);
													frame11.setTitle("El Chorro Definitivo, final");
													frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													JButton end = new JButton("<html>Vas al juzgado así, sos ININPUTABLE hermano, en 10 días salís</html>");
													frame11.add(end);
										
													
													end.addActionListener(new ActionListener() {

														@Override
														public void actionPerformed(ActionEvent e) {
															System.exit(0);
															
														}
														
													});
													
													
												}
												
											});
											noPapoteas.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent e) {
													JFrame frame10 = new JFrame();
													frame10.setVisible(true);
													frame10.setSize(500,500);
													frame10.setTitle("El Chorro Definitivo, fallo");
													frame10.setLayout(new GridLayout(1,2));
													frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
													frame10.add(new JLabel("<html>Como no has podido demostrar<br> tu estado de locura, <br>sos putable hermano<br>salís en más de 10 días.</html>"));
													JButton volver4 = new JButton("Volver");
													frame10.add(volver4);
													volver4.addActionListener(new ActionListener() {

														@Override
														public void actionPerformed(ActionEvent e) {
															frame10.setVisible(true);
															
														}
														
													});
													
												}
												
											});
											
										}
										
									});
									abajo.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent e) {
											JFrame frame8 = new JFrame();
											frame8.setVisible(true);
											frame8.setSize(500,500);
											frame8.setTitle("El Chorro Definitivo, fallo");
											frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
											frame8.setLayout(new GridLayout(1,2));
											frame8.add(new JLabel("<html>Ahora no puedes demostrar<br> tu estado de locura.</html>"));
											JButton volver3 = new JButton("Volver");
											frame8.add(volver3);
											volver3.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent e) {
													frame8.setVisible(false);
													
												}
												
											});
											
										}
										
									});
									
								}
								
							});
							primerDormitorio.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									JFrame frame6 = new JFrame();
									frame6.setVisible(true);
									frame6.setSize(500,500);
									frame6.setLayout(new GridLayout(1,2));
									frame6.setTitle("El Chorro Definitivo, fallo");
									frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									frame6.add(new JLabel("Busca un lugar más escondido"));
									JButton volver2 = new JButton("Volver");
									frame6.add(volver2);
									volver2.addActionListener(new ActionListener(){

										@Override
										public void actionPerformed(ActionEvent e) {
											frame6.setVisible(false);
											
										}
										
									});
									
									
								}
								
							});
							
							
							
						}
						
					});
					patio.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
								JFrame frame4 = new JFrame();
								frame4.setTitle("El Chorro Definitivo, fallo");
								frame4.setSize(500,500);
								frame4.setVisible(true);
								frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								frame4.setLayout(new GridLayout(1,2));
								frame4.add(new JLabel("<html>No amigo, ahora van a decir<br> que se cayó de la medianera.</html>"));
								JButton volver = new JButton("Volver");
								frame4.add(volver);
								volver.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										frame4.setVisible(false);
										
									}
									
								});

							
						}
						
					});
					
					
				}
				
			});
			
		}


	});

}
}
