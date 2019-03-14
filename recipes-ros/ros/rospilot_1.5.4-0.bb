DESCRIPTION = "rospilot"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "sensor-msgs geometry-msgs std-msgs std-srvs message-generation roslint libgphoto-dev roscpp ffmpeg libturbojpeg libnl-3-dev libmicrohttpd opencv vision-opencv libnl-3 rosbash dnsmasq hostapd rospy mavlink message-runtime sensor-msgs geometry-msgs std-msgs std-srvs rosbridge-suite python-pyserial python-cherrypy python-psutil python-colorama roslaunch python-mapnik python-tilestache mapnik-utils gdal-bin osm2pgsql postgresql-postgis curl unzip wget"

RDEPENDS_${PN} = "vision-opencv libnl-3 rosbash dnsmasq hostapd rospy mavlink message-runtime sensor-msgs geometry-msgs std-msgs std-srvs rosbridge-suite python-pyserial python-cherrypy python-psutil python-colorama roslaunch python-mapnik python-tilestache mapnik-utils gdal-bin osm2pgsql postgresql-postgis curl unzip wget"

SRC_URI = "https://github.com/rospilot/rospilot-release/archive/release/melodic/rospilot/1.5.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d34d237a255899d3169006880d2ffe9c"
SRC_URI[sha256sum] = "787c239f6ab1075c9c82e59c6490d03c4e364551e2e529fe5fc18cdffbfc8e2c"

S = "${WORKDIR}/rospilot-release-release-melodic-rospilot-1.5.4-0"

inherit catkin
