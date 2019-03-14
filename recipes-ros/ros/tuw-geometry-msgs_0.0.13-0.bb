DESCRIPTION = "The tuw_geometry_msgs package"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "roscpp rospy message-runtime std-msgs geometry-msgs"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_geometry_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b1c9abf8c142e52dcd7210567eba180"
SRC_URI[sha256sum] = "423e031652dcf0357d6e857d9a40e120bd249816739ca42785c2961006ddfbce"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_geometry_msgs-0.0.13-0"

inherit catkin
