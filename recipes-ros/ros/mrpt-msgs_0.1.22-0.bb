DESCRIPTION = "ROS messages for MRPT classes and objects"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs geometry-msgs sensor-msgs message-runtime std-msgs geometry-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs geometry-msgs sensor-msgs"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_msgs-release/archive/release/melodic/mrpt_msgs/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fcc25ae883e1be9ea366cb6310261991"
SRC_URI[sha256sum] = "baf8fd73e1c316f837c29fcaea20d6cb5cb84d4083813944b09005de9297de1d"

S = "${WORKDIR}/mrpt_msgs-release-release-melodic-mrpt_msgs-0.1.22-0"

inherit catkin
