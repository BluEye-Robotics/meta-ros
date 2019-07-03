DESCRIPTION = "ROS package for Multiple objects detection, tracking and classification from LIDAR scans/point-clouds"
AUTHOR = "Praveen Palanisamy"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "pcl-ros roscpp sensor-msgs visualization-msgs pcl cv-bridge libpcl-all pcl-ros roscpp sensor-msgs visualization-msgs cv-bridge"

RDEPENDS_${PN} = "libpcl-all pcl-ros roscpp sensor-msgs visualization-msgs cv-bridge"

SRC_URI = "https://github.com/praveen-palanisamy/multi_object_tracking_lidar-release/archive/release/melodic/multi_object_tracking_lidar/1.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "781515c355686ffd7fae7e1b6247d4f1"
SRC_URI[sha256sum] = "2c8c139caef500a457297233231fcdb913d3106954789481277d4c028df6219f"

S = "${WORKDIR}/multi_object_tracking_lidar-release-release-melodic-multi_object_tracking_lidar-1.0.1-1"

inherit catkin
