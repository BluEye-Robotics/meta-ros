DESCRIPTION = "The VRPN is a library and set of servers that interfaces with virtual-reality systems, such as VICON, OptiTrack, and others."
AUTHOR = "Russell M. Taylor"
SECTION = "devel"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1c7945be8716a98e36e855a20dc9b844"

DEPENDS = "catkin"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/ros-drivers-gbp/vrpn-release/archive/release/melodic/vrpn/7.34.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f03ae5c930144e53fbe90cbb3339ee28"
SRC_URI[sha256sum] = "1dd53934e26a049fba648ddb79d87c96a229181479c14a8c743fde9bddf854c3"

S = "${WORKDIR}/vrpn-release-release-melodic-vrpn-7.34.0-1"

inherit catkin
