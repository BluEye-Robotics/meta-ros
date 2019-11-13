DESCRIPTION = "franka_msgs provides messages specific to Franka Emika research robots"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_msgs/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "157f5d83dc0d3403809f0d70ffd6214f"
SRC_URI[sha256sum] = "7cf7e5ef5026c2227e099f45d283c1caa5b952a626b320144ca99b6ac9c69e49"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_msgs-0.6.0-1"

inherit catkin
