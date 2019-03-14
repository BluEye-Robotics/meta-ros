DESCRIPTION = "Extract geometry value of a vehicle from urdf"
AUTHOR = "Vincent Rousseau"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp urdf tf2"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/urdf_geometry_parser-release/archive/release/melodic/urdf_geometry_parser/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dcac7448a1e257f228b5b084bc10461b"
SRC_URI[sha256sum] = "e9abdad19d455ac3e82dffae119a7e212d53874d4587df5cb5664ac397b86a3f"

S = "${WORKDIR}/urdf_geometry_parser-release-release-melodic-urdf_geometry_parser-0.0.3-0"

inherit catkin
