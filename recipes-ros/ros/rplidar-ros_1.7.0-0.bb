DESCRIPTION = "The rplidar ros package, support rplidar A2/A1 and A3"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosconsole sensor-msgs std-srvs roscpp rosconsole sensor-msgs std-srvs"

RDEPENDS_${PN} = "roscpp rosconsole sensor-msgs std-srvs"

SRC_URI = "https://github.com/Slamtec/rplidar_ros-release/archive/release/melodic/rplidar_ros/1.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f0a500d82d77f57b883747c2ff39ebb6"
SRC_URI[sha256sum] = "548d65fb0fba265d22e0ad2e2fdb4d522f97a751b62bf01fb7dfbac36e9899d4"

S = "${WORKDIR}/rplidar_ros-release-release-melodic-rplidar_ros-1.7.0-0"

inherit catkin
