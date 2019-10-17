DESCRIPTION = "This package contains a set of conversion functions to convertcommon tf datatypes (point, vector, pose, etc) into semanticallyidentical datatypes used by other libraries. The conversion functionsmake it easier for users of the transform library (tf) to work withthe datatype of their choice. Currently this package has support forthe Kinematics and Dynamics Library (KDL) and the Eigen matrixlibrary. This package is stable, and will get integrated into tf inthe next major release cycle (see roadmap)."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen geometry-msgs kdl-conversions orocos-kdl tf libeigen geometry-msgs kdl-conversions orocos-kdl python3-orocos-kdl tf"

RDEPENDS_${PN} = "libeigen geometry-msgs kdl-conversions orocos-kdl python3-orocos-kdl tf"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/tf_conversions/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb8e975aea29d6190e65753bdc433b61"
SRC_URI[sha256sum] = "eec87e068f5106c1835fb093d5995ca8c6972e3a5e127038d94c68701ad2029e"

ROS_SPN = "geometry"
S = "${WORKDIR}/geometry-release-release-melodic-tf_conversions-1.12.0-0"

inherit catkin
