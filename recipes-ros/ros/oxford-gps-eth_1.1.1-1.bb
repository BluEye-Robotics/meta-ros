DESCRIPTION = "Ethernet interface to OxTS GPS receivers (NCOM packet structure)"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roscpp std-msgs geometry-msgs sensor-msgs nav-msgs gps-common tf"

RDEPENDS_${PN} = "roslaunch"

SRC_URI = "https://github.com/DataspeedInc-release/oxford_gps_eth-release/archive/release/melodic/oxford_gps_eth/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb23d0ff4e6d78db4c3d632aa5993ff6"
SRC_URI[sha256sum] = "bcd0dd5be46ee6f14125e36fb76cd6eb1e951d97fab3d1917243609fcf3b8eda"

S = "${WORKDIR}/oxford_gps_eth-release-release-melodic-oxford_gps_eth-1.1.1-1"

inherit catkin
