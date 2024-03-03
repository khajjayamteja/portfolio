# Use the official Nginx image as the base image
FROM nginx:alpine

# Copy the HTML files and other assets into the Nginx default public directory
COPY index.html /usr/share/nginx/html/
COPY css /usr/share/nginx/html/css
COPY js /usr/share/nginx/html/js
COPY images /usr/share/nginx/html/images

# Expose port 80 to the outside world
EXPOSE 80
