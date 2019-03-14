DESCRIPTION = "The Extensible Optimization Toolset (EXOTica) is a library for defining problems for robot motion planning."
AUTHOR = "Michael Camilleri"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roscpp geometry-msgs std-msgs message-runtime moveit-core moveit-ros-planning moveit-msgs tf kdl-parser pluginlib eigen-conversions tf-conversions libtinyxml2"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_core/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "292a502a78a558f851cb37d46b690751"
SRC_URI[sha256sum] = "c5f91ca156ad37a8357e9b650c39fab45ea4327bf1a4a645f1bdc2bcde2e59fc"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_core-5.0.0-0"

inherit catkin
