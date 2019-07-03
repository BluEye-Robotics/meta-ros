DESCRIPTION = "The mbf_costmap_nav package contains the costmap navigation server implementation of Move Base Flex (MBF). The costmap navigation server is bound to the"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs move-base-msgs move-base"

RDEPENDS_${PN} = "tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs move-base-msgs move-base"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_costmap_nav/0.2.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "442771967bcc85ce1c8e59fae4442eee"
SRC_URI[sha256sum] = "b528c3ba7d8e6e7690e9513bcfa2a407cad533930b6d1d3003376fe94d11a7a8"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_costmap_nav-0.2.4-1"

inherit catkin
