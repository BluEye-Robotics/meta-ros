DESCRIPTION = "The mbf_costmap_nav package contains the costmap navigation server implementation of Move Base Flex (MBF). The costmap navigation server is bound to the"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs move-base-msgs move-base"

RDEPENDS_${PN} = "tf roscpp pluginlib actionlib actionlib-msgs base-local-planner dynamic-reconfigure std-msgs std-srvs mbf-abstract-nav mbf-costmap-core mbf-msgs mbf-utility nav-core nav-msgs geometry-msgs move-base-msgs move-base"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_costmap_nav/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8fd53de9362a9bfb639b1a090e66337e"
SRC_URI[sha256sum] = "9bcf5fc8d5fb225a165dca3f2ce12e4a1cea0c875b183ad922cbf63a51ea65ff"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_costmap_nav-0.2.5-1"

inherit catkin
