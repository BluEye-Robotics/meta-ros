DESCRIPTION = "Basic ROS support for the Robosense 3D LIDARs."
AUTHOR = "Tony Zhang"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "rslidar-driver rslidar-msgs rslidar-pointcloud"

RDEPENDS_${PN} = "rslidar-driver rslidar-msgs rslidar-pointcloud"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "850df75c9abd3f9e4f2f31d317f38fff"
SRC_URI[sha256sum] = "afc1683d73695c2460bccb0db0b1ecf4907ddff91506e6c4c33ac34ecf91a5f6"

ROS_SPN = "robosense"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar-1.0.2-0"

inherit catkin
