DESCRIPTION = "This metapackage depends on the SMACH library and ROS SMACH integration packages."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "smach smach-ros smach-msgs"

SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/melodic/executive_smach/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19ae42cd6e954e8da1c64e79e8599c7c"
SRC_URI[sha256sum] = "5266563dc0f5888791fbf077127b3bb5539550c93496a103a4b0f3e1bafef697"

S = "${WORKDIR}/executive_smach-release-release-melodic-executive_smach-2.0.1-0"

inherit catkin
