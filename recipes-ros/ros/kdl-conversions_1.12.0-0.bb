DESCRIPTION = "Conversion functions between KDL and geometry_msgs types."
AUTHOR = "Adam Leeper"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs orocos-kdl geometry-msgs orocos-kdl"

RDEPENDS_${PN} = "geometry-msgs orocos-kdl"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/kdl_conversions/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc3247fc1d72cb407c2d3de99534728f"
SRC_URI[sha256sum] = "2a82a8648b7c47cdf7ee46f7bf331202c2d8e6a6d25c058d944f78283452994f"

ROS_SPN = "geometry"
S = "${WORKDIR}/geometry-release-release-melodic-kdl_conversions-1.12.0-0"

inherit catkin
