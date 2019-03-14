DESCRIPTION = ""
AUTHOR = "Brian P. Gerkey"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=24;endline=24;md5=58d727014cda5ed405b7fb52666a1f97"

DEPENDS = "message-filters tf2-geometry-msgs dynamic-reconfigure geometry-msgs nav-msgs rosbag roscpp sensor-msgs std-srvs tf2 tf2-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/amcl/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1348b43538865e3171c22ff086f9f0e4"
SRC_URI[sha256sum] = "01fc59bbf881b23905d1df0d056f0d2a76d1ce4801c70e68f3f6bfb7f2a6c818"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-amcl-1.16.2-0"

inherit catkin
