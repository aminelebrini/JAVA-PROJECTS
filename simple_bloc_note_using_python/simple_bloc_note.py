import tkinter as tk
from tkinter import messagebox
from tkinter import Canvas


# Add note
def add_note(not_entry, not_list):
    not_text = not_entry.get()
    if not_text:
        not_list.insert(tk.END, not_text)
        not_entry.delete(0, tk.END)
    else:
        messagebox.showwarning("Avertissement", "Veuillez entrer du texte pour la note.")

# Delete note
def delete_note(not_entry, not_list):
    selected_index = not_list.curselection()
    if selected_index:
        not_list.delete(selected_index)
        not_entry.delete(0, tk.END)
    else:
        messagebox.showwarning("Avertissement", "Veuillez sélectionner une note à supprimer.")

# Second window
def second_wind():
    second_window = tk.Tk()
    second_window.title("BLOC NOTES")
    second_window.geometry('400x600')
    second_window.configure(bg='blue')

    canvas = tk.Canvas(second_window, width=400, height=50, bg='blue')
    canvas.pack()

    not_list = tk.Listbox(second_window, selectmode=tk.SINGLE)
    not_list.pack(pady=0)

    not_entry = tk.Entry(second_window, width=30)
    not_entry.pack(pady=5)

    # Buttons for adding and deleting notes
    add_button = tk.Button(second_window, text="Ajouter Note", command=lambda: add_note(not_entry, not_list))
    add_button.pack(pady=5)

    delete_button = tk.Button(second_window, text="Supprimer Note", command=lambda: delete_note(not_entry, not_list))
    delete_button.pack(pady=5)

    second_window.mainloop()

# First window
wind = tk.Tk()
wind.title("BLOC NOTES")
wind.geometry("400x600")

# Button to open the second window
enter_button = tk.Button(wind, text="ENTRER", font=('Arial', 17), command=second_wind)
enter_button.pack(pady=250)

wind.mainloop()
