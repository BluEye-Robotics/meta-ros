DESCRIPTION = "Conversion functions between: - Eigen and KDL - Eigen and geometry_msgs."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs libeigen orocos-kdl std-msgs geometry-msgs libeigen orocos-kdl std-msgs"

RDEPENDS_${PN} = "geometry-msgs libeigen orocos-kdl std-msgs"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/eigen_conversions/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "585ac82f481d188939805c93e9bdb14a"
SRC_URI[sha256sum] = "6485f64dd54db8430e4aacfa15b0d09b575aff8cfcf4ad24f946e090004521ad"

ROS_SPN = "geometry"
S = "${WORKDIR}/geometry-release-release-melodic-eigen_conversions-1.12.0-0"

inherit catkin
