package Giris;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Dogdunuz ayi giriniz : ");
        month = input.nextInt();
        System.out.print("Dogdunuz gunu giriniz : ");
        day = input.nextInt();

        if (month>=1 && month<=12) {
            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "oglak";
                    } else {
                        burc = "kova";

                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "kova";
                    } else {
                        burc = "balik";

                    }
                } else {
                    isError = true;
                }
            }else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "balik";
                    } else {
                        burc = "koc";

                    }
                } else {
                    isError = true;
                }

            }else if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        burc = "koc";
                    } else {
                        burc = "boga";

                    }
                } else {
                    isError = true;
                }

            }else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "boga";
                    } else {
                        burc = "ikizler";

                    }
                } else {
                    isError = true;
                }

            }else if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        burc = "ikizler";
                    } else {
                        burc = "yengec";

                    }
                } else {
                    isError = true;
                }
            }else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "yengec";
                    } else {
                        burc = "aslan";

                    }
                } else {
                    isError = true;
                }

            }else if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "aslan";
                    } else {
                        burc = "basak";

                    }
                } else {
                    isError = true;
                }


            }else if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        burc = "basak";
                    } else {
                        burc = "terazi";

                    }
                } else {
                    isError = true;
                }


            }else if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "terazi";
                    } else {
                        burc = "akrep";

                    }
                } else {
                    isError = true;
                }
            }else if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        burc = "akrep";
                    } else {
                        burc = "yay";

                    }
                } else {
                    isError = true;
                }
            }else if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 20) {
                        burc = "yay";
                    } else {
                        burc = "oglak";

                    }
                } else {
                    isError = true;
                }
            }if (isError) {
                System.out.println("Hatali giris yaptiniz...");
            } else {
                System.out.println("burcunuz:" + burc);
            }


        }else {
            System.out.println("hatali giris yaptiniz...");
        }

        }

    }





