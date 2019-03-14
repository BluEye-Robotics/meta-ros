DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types. Note that the srvs available through this plugin is the ones that are stored on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "Aaron Blasdel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosmsg rospy rqt-gui rqt-gui-py rqt-msg"

RDEPENDS_${PN} = "rosmsg rospy rqt-gui rqt-gui-py rqt-msg"

SRC_URI = "https://github.com/ros-gbp/rqt_srv-release/archive/release/melodic/rqt_srv/0.4.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a15bd968cb8a9c03b253c261bcbe80f"
SRC_URI[sha256sum] = "601cd2f2679ebf45e306a1b9e6ddaca9dcbb2c614c26cdedc87e2e65c1c2571f"

S = "${WORKDIR}/rqt_srv-release-release-melodic-rqt_srv-0.4.8-0"

inherit catkin
