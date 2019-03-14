DESCRIPTION = "The interactive_marker_tutorials package"
AUTHOR = "David Gossow"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp interactive-markers visualization-msgs tf roscpp interactive-markers visualization-msgs tf"

RDEPENDS_${PN} = "roscpp interactive-markers visualization-msgs tf"

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/interactive_marker_tutorials/0.10.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d567334a19a5f9cb20e93d11e654cc3a"
SRC_URI[sha256sum] = "9871ffc4468273f1bd8f38a84e6dafa224057f8ebd89db86e0ab174ab46c06eb"

ROS_SPN = "visualization_tutorials"
S = "${WORKDIR}/visualization_tutorials-release-release-melodic-interactive_marker_tutorials-0.10.3-0"

inherit catkin
