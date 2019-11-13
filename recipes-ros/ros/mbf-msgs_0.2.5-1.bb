DESCRIPTION = "The move_base_flex messages package providing the action definition files for the action GetPath, ExePath, Recovery and MoveBase. The action servers providing these action are implemented in"
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "std-msgs nav-msgs geometry-msgs actionlib-msgs genmsg message-runtime message-generation std-msgs nav-msgs geometry-msgs actionlib-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs nav-msgs geometry-msgs actionlib-msgs message-runtime"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_msgs/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ffd2f40b46ffb9e4ee0f72aa060ca7ce"
SRC_URI[sha256sum] = "20416ab6883406abbb41d55b922c4f07040d09b1404762d980d28c6528e7ce0a"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_msgs-0.2.5-1"

inherit catkin
