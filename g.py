def decode(message_file):
    pyramid_lines = []
    
    # Read the lines from the file and store them in a list
    with open(message_file, 'r') as file:
        pyramid_lines = file.readlines()
    
    decoded_words = []
    
    # Iterate through each line of the pyramid
    for i, line in enumerate(pyramid_lines):
        # Split the line into numbers and words
        parts = line.split()
        
        # Extract the numbers
        numbers = [int(part) for part in parts if part.isdigit()]
        
        # Add the word corresponding to the last number in the line
        decoded_words.append(parts[numbers[-1]])
    
    # Join the decoded words to form the final message
    decoded_message = ' '.join(decoded_words)
    
    return decoded_message

# Example usage:
message_file = 'coding_qual_input.txt'  # Replace with the actual file path
decoded_message = decode(message_file)
print(decoded_message)
