DESCRIPTION = ""
AUTHOR = "Dan Solomon (Southwest Research Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=30;endline=30;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "abb-driver joint-state-publisher robot-state-publisher  xacro"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb6640_support/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5714ce6ec559fbdb4009afd60577dd2f"
SRC_URI[sha256sum] = "d17461d90cb90812a3dd31ee5389a91ead91212c235b534e5a5512c684e04464"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb6640_support-1.3.1-1"

inherit catkin
