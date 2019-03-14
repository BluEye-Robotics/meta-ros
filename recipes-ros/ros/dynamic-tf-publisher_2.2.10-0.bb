DESCRIPTION = "dynamically set the tf trensformation"
AUTHOR = "Manabu Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation rospy tf dynamic-reconfigure geometry-msgs message-runtime rospy tf"

RDEPENDS_${PN} = "geometry-msgs message-runtime rospy tf"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/dynamic_tf_publisher/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "384dd9f1003d829f81b8862ea32d27f5"
SRC_URI[sha256sum] = "a6f34176461073a9a15126d6c6948988f94fc3de6d9698a9c94d7784e941a914"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-dynamic_tf_publisher-2.2.10-0"

inherit catkin
