import tkinter as tk
from tkinter import messagebox

def login():
    ANASS = {"id": "AN123", "ps": "12345"}
    AMINE = {"id": "AM123", "ps": "1234"}

    entered_username = username.get()
    entered_password = password.get()

    if entered_username == ANASS["id"] and entered_password == ANASS["ps"]:
        show_second_window_first_user()
    elif entered_username == AMINE["id"] and entered_password == AMINE["ps"]:
        show_second_window_second_user()
    else:
        messagebox.showerror("Invalid Login", "Incorrect IDANTIFIANT or MOT DE PASSE")

def show_second_window_first_user():
    root.iconify()
    second_window = tk.Toplevel(root)
    second_window.title("ESPACE DE CLIENT")
    second_window.geometry('400x600')
    second_window.configure(bg='white')

    # Menu for the second window
    menu_bar = tk.Menu(second_window)
    second_window.config(menu=menu_bar)

    file_menu = tk.Menu(menu_bar, tearoff=0)
    menu_bar.add_cascade(label="File", menu=file_menu)
    file_menu.add_command(label="Exit", command=root.destroy)

    service_menu = tk.Menu(menu_bar, tearoff=0)
    menu_bar.add_cascade(label="Service", menu=service_menu)
    service_menu.add_command(label="Virement", command=perform_virement)
    service_menu.add_command(label="Dotation", command=perform_dotation)
    service_menu.add_command(label="Demande de RIB", command=demande_rib)

    canvas = tk.Canvas(second_window, width=400, height=50, bg='red', highlightthickness=0)
    canvas.pack()

    rectangle = canvas.create_rectangle(0, 0, 400, 50, fill='red')
    text = canvas.create_text(200, 25, text='AMINE BANK', font=('Arial', 12, 'bold'), fill='white')

    user_compte = tk.Label(second_window, text="BONJOUR ANASS LEBRINI", font=('Arial', 10, 'bold'), fg='blue',
                           bg='white')
    user_compte.pack(padx=12, pady=20)
    num_compte = tk.Label(second_window, text="VOTE NUMERO DE COMPTE:", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    num_compte.pack()

    num_compte1 = tk.Label(second_window, text="123456789101112131415")
    num_compte1.pack()

    label = tk.Label(second_window, text="VOTRE SOLDE: 1000 MAD", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    label.pack(pady=20)
    service_label = tk.Label(second_window, text="SERVICE :", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    service_label.pack()

    facture = tk.Button(second_window, text="PAYER LES FACTURE", fg='black', font=('Arial', 10, 'bold'), bg='white')
    facture.pack(side=tk.TOP)

    prets = tk.Button(second_window, text="MES PRETS", fg='black', font=('Arial', 10, 'bold'), bg='white')
    prets.pack(pady=2)

    eff_recharge = tk.Button(second_window, text="EFFECTUEZ UNE RECHARGE", fg='black', font=('Arial', 10, 'bold'),
                             bg='white')
    eff_recharge.pack(pady=2)

    eff_virement = tk.Button(second_window, text="EFFECTUEZ UN VIREMENT", fg='black', font=('Arial', 10, 'bold'),
                             bg='white')
    eff_virement.pack(pady=2)

    btn_back_to_main = tk.Button(second_window, text="RETOUR", command=show_main_window)
    btn_back_to_main.pack(pady=20)

def show_second_window_second_user():
    root.iconify()
    second_window = tk.Toplevel(root)
    second_window.title("ESPACE DE CLIENT")
    second_window.geometry('400x600')
    second_window.configure(bg='white')

    # Menu for the second window
    menu_bar = tk.Menu(second_window)
    second_window.config(menu=menu_bar)

    file_menu = tk.Menu(menu_bar, tearoff=0)
    menu_bar.add_cascade(label="File", menu=file_menu)
    file_menu.add_command(label="Exit", command=root.destroy)

    service_menu = tk.Menu(menu_bar, tearoff=0)
    menu_bar.add_cascade(label="Service", menu=service_menu)
    service_menu.add_command(label="Virement", command=perform_virement)
    service_menu.add_command(label="Dotation", command=perform_dotation)
    service_menu.add_command(label="Demande de RIB", command=demande_rib)

    canvas = tk.Canvas(second_window, width=400, height=50, bg='red', highlightthickness=0)
    canvas.pack()

    rectangle = canvas.create_rectangle(0, 0, 400, 50, fill='red')
    text = canvas.create_text(200, 25, text='AMINE BANK', font=('Arial', 12, 'bold'), fill='white')

    user_compte = tk.Label(second_window, text="BONJOUR AMINE LEBRINI", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    user_compte.pack()
    num_compte = tk.Label(second_window, text="VOTE NUMERO DE COMPTE:", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    num_compte.pack()

    num_compte1 = tk.Label(second_window, text="123456789202122232425262")
    num_compte1.pack()

    label = tk.Label(second_window, text="VOTRE SOLDE: 1000 MAD", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    label.pack(pady=20)
    service_label = tk.Label(second_window, text="SERVICE :", font=('Arial', 10, 'bold'), fg='blue', bg='white')
    service_label.pack()

    facture = tk.Button(second_window, text="PAYER LES FACTURE", fg='black', font=('Arial', 10, 'bold'), bg='white')
    facture.pack(side=tk.TOP)

    prets = tk.Button(second_window, text="MES PRETS", fg='black', font=('Arial', 10, 'bold'), bg='white')
    prets.pack(pady=2)

    eff_recharge = tk.Button(second_window, text="EFFECTUEZ UNE RECHARGE", fg='black', font=('Arial', 10, 'bold'),
                             bg='white')
    eff_recharge.pack(pady=2)

    eff_virement = tk.Button(second_window, text="EFFECTUEZ UN VIREMENT", fg='black', font=('Arial', 10, 'bold'),
                             bg='white')
    eff_virement.pack(pady=2)

    btn_back_to_main = tk.Button(second_window, text="RETOUR", command=show_main_window)
    btn_back_to_main.pack(pady=20)

def perform_virement():
    messagebox.showinfo("Virement", "Performing Virement")

def perform_dotation():
    messagebox.showinfo("Dotation", "Performing Dotation")

def demande_rib():
    messagebox.showinfo("Demande de RIB", "Making RIB Request")

def show_main_window():
    root.destroy()
    root.deiconify()

# Set up the main window
root = tk.Tk()
root.title("AMINE BANK")
root.geometry('400x600')
root.configure(bg='red')

frame = tk.Frame(root, bg='red')
label = tk.Label(frame, text="JE ME CONNECTE", font=('Arial', 18, 'bold'), fg='white', bg='red')
username_label = tk.Label(frame, text="IDANTIFIANT", font=('Arial', 10, 'bold'), fg='white', bg='red')
username = tk.Entry(frame)
password_label = tk.Label(frame, text="MOT DE PASSE", font=('Arial', 10, 'bold'), fg='white', bg='red')
password = tk.Entry(frame, show="*")

label.grid(row=0, column=0, columnspan=2, pady=40)
username_label.grid(row=1, column=0)
username.grid(row=1, column=1)
password_label.grid(row=2, column=0)
password.grid(row=2, column=1)
frame.pack()

btn_open_second = tk.Button(root, text="CONNEXION", fg='red', font=('Arial', 10, 'bold'), bg='white', command=login)
btn_open_second.pack(pady=5)

root.mainloop()
