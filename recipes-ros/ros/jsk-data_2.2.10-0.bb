DESCRIPTION = "The jsk_data package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure message-generation depth-image-proc dynamic-reconfigure image-transport jsk-topic-tools message-runtime nodelet openni-launch paramiko pr2-description pr2-machine python3-click python3-gdown-pip python3-pyyaml rosbag rqt-bag  tf2-ros xacro"

RDEPENDS_${PN} = "depth-image-proc dynamic-reconfigure image-transport jsk-topic-tools message-runtime nodelet openni-launch paramiko pr2-description pr2-machine python3-click python3-gdown-pip python3-pyyaml rosbag rqt-bag  tf2-ros xacro"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_data/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13eff7e8e39335b069254ae920bfe25c"
SRC_URI[sha256sum] = "2a23f49d88eb32f0ecc762fa43fccef0a549e2f6f68d78f54e8eaf11fd415f0b"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_data-2.2.10-0"

inherit catkin
