DESCRIPTION = "The tuw_marker_detection package"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "tuw-ellipses tuw-checkerboard tuw-aruco tuw-marker-pose-estimation"

RDEPENDS_${PN} = "tuw-ellipses tuw-checkerboard tuw-aruco tuw-marker-pose-estimation"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_marker_detection/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c277deff5d56bfa8e7cb38edff0a670f"
SRC_URI[sha256sum] = "4b831ec3d6f8678dad02b5e96201e7944af7210da72b19a90d72d48ed4628ec9"

S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_marker_detection-0.1.1-1"

inherit catkin
