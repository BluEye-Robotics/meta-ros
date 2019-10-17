DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the Care-O-bot robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Nadia Hammoudeh Garcia"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros rosbash rospy rosunit xacro"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_description/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8752e76629b32e201d9d138fe1198760"
SRC_URI[sha256sum] = "256b6a129e52dacbf23b263cf2eed6f1addf9ec7a718a6f658df8eacd6abb189"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_description-0.6.10-0"

inherit catkin
