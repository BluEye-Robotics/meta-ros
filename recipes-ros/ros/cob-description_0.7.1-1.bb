DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the Care-O-bot robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "Nadia Hammoudeh Garcia"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros rosbash rospy rosunit xacro"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_description/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ae70e933bbe7deb48249f7de3c4b907"
SRC_URI[sha256sum] = "9c1bf2a21aecd087d7383deb60102cf6654b3e08832160b3a6fe3e4f3c804d0c"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_description-0.7.1-1"

inherit catkin
