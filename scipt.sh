docker run --name mytest -p 41061:22 -p 41062:80 -d -v ~/home/deena/Desktop/QR-Menu:/www tomsik68/xampp:8
docker cp  /home/deena/Desktop/QR-Menu mytest:/opt/lampp/htdocs
