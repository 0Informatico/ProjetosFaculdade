import tkinter as tk
from tkinter import ttk

def add_number(entry_widget, number_to_add):
    """Adds a specific number to the value in the given entry widget."""
    try:
        current_value = int(entry_widget.get())
        entry_widget.delete(0, tk.END)
        entry_widget.insert(0, str(current_value + number_to_add))
    except ValueError:
        # Handle case where entry is empty or not a valid number
        entry_widget.delete(0, tk.END)
        entry_widget.insert(0, str(number_to_add))

def create_ui(ataque,dano):
    root = tk.Tk()
    root.title("Esqueletos Treinamento")

    # Main title
    tk.Label(root, text="Esqueletos", font=("Arial", 16, "bold")).grid(row=0, column=0, columnspan=4, pady=10)

    # Arqueiros Section
    arqueiros_frame = ttk.LabelFrame(root, text="Arqueiros")
    arqueiros_frame.grid(row=1, column=0, columnspan=2, padx=10, pady=5, sticky="nsew")

    # Espadachins Section
    espadachins_frame = ttk.LabelFrame(root, text="Espadachins")
    espadachins_frame.grid(row=1, column=2, columnspan=2, padx=10, pady=5, sticky="nsew")

    # --- Arqueiros Widgets ---
    # Row 1
    entry_1 = tk.Entry(arqueiros_frame, width=10, justify='center')
    entry_1.grid(row=0, column=0, padx=5, pady=5, ipady=5)
    entry_1.insert(0, "0") # Default value

    btn_5 = tk.Button(arqueiros_frame, text="+", width=3, command=lambda: add_number(entry_1, 1))
    btn_5.grid(row=0, column=1, padx=2, pady=2)

    btn_6 = tk.Button(arqueiros_frame, text="-", width=3, command=lambda: add_number(entry_1, -1))
    btn_6.grid(row=1, column=1, padx=2, pady=2)

    btn_13 = tk.Button(arqueiros_frame, text="Ataque", bg="orange", command=lambda: ataque(entry_1,'arqueiro'))
    btn_13.grid(row=0, column=2, rowspan=2, padx=5, pady=5, sticky="nsew")

    # Row 2
    entry_2 = tk.Entry(arqueiros_frame, width=10, justify='center')
    entry_2.grid(row=2, column=0, padx=5, pady=5, ipady=5)
    entry_2.insert(0, "0") # Default value

    btn_7 = tk.Button(arqueiros_frame, text="+", width=3, command=lambda: add_number(entry_2, 1))
    btn_7.grid(row=2, column=1, padx=2, pady=2)

    btn_8 = tk.Button(arqueiros_frame, text="-", width=3, command=lambda: add_number(entry_2, -1))
    btn_8.grid(row=3, column=1, padx=2, pady=2)

    btn_14 = tk.Button(arqueiros_frame, text="Dano", bg="orange", command=lambda: dano(entry_2,'arqueiro'))
    btn_14.grid(row=2, column=2, rowspan=2, padx=5, pady=5, sticky="nsew")

    # --- Espadachins Widgets ---
    # Row 1
    entry_3 = tk.Entry(espadachins_frame, width=10, justify='center')
    entry_3.grid(row=0, column=0, padx=5, pady=5, ipady=5)
    entry_3.insert(0, "0") # Default value

    btn_9 = tk.Button(espadachins_frame, text="+", width=3, command=lambda: add_number(entry_3, 1))
    btn_9.grid(row=0, column=1, padx=2, pady=2)

    btn_10 = tk.Button(espadachins_frame, text="-", width=3, command=lambda: add_number(entry_3, -1))
    btn_10.grid(row=1, column=1, padx=2, pady=2)

    btn_15 = tk.Button(espadachins_frame, text="Ataque", bg="orange", command=lambda: ataque(entry_3,'espada'))
    btn_15.grid(row=0, column=2, rowspan=2, padx=5, pady=5, sticky="nsew")

    # Row 2
    entry_4 = tk.Entry(espadachins_frame, width=10, justify='center')
    entry_4.grid(row=2, column=0, padx=5, pady=5, ipady=5)
    entry_4.insert(0, "0") # Default value

    btn_11 = tk.Button(espadachins_frame, text="+", width=3, command=lambda: add_number(entry_4, 1))
    btn_11.grid(row=2, column=1, padx=2, pady=2)

    btn_12 = tk.Button(espadachins_frame, text="-", width=3, command=lambda: add_number(entry_4, -1))
    btn_12.grid(row=3, column=1, padx=2, pady=2)

    btn_16 = tk.Button(espadachins_frame, text="Dano", bg="orange", command=lambda: dano(entry_4,'espada'))
    btn_16.grid(row=2, column=2, rowspan=2, padx=5, pady=5, sticky="nsew")

    # Configure column weights for resizing
    root.grid_columnconfigure(0, weight=1)
    root.grid_columnconfigure(1, weight=1)
    root.grid_columnconfigure(2, weight=1)
    root.grid_columnconfigure(3, weight=1)
    
    arqueiros_frame.grid_columnconfigure(0, weight=1)
    arqueiros_frame.grid_columnconfigure(1, weight=0) # Buttons should not expand
    arqueiros_frame.grid_columnconfigure(2, weight=1)

    espadachins_frame.grid_columnconfigure(0, weight=1)
    espadachins_frame.grid_columnconfigure(1, weight=0) # Buttons should not expand
    espadachins_frame.grid_columnconfigure(2, weight=1)

    root.mainloop()
