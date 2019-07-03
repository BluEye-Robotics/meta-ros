DESCRIPTION = "The move_base_flex messages package providing the action definition files for the action GetPath, ExePath, Recovery and MoveBase. The action servers providing these action are implemented in"
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "std-msgs nav-msgs geometry-msgs actionlib-msgs genmsg message-runtime message-generation std-msgs nav-msgs geometry-msgs actionlib-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs nav-msgs geometry-msgs actionlib-msgs message-runtime"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_msgs/0.2.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5f4cbdbe93bc1a8148dcebdb3a47b7b"
SRC_URI[sha256sum] = "40f96691ac0963edfb6194a79452d45e36fa28bb86173d7ed974e55714e01fb8"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_msgs-0.2.4-1"

inherit catkin
