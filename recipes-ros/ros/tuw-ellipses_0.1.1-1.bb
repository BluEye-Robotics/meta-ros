DESCRIPTION = "The tuw_ellipses package contains a computer vision library which is able to detect ellipses within images. The package is able to estimate the pose of the circle related to the ellipse the circle diameter as well as the camera parameter are known. A dynamic reconfigure interface allows the user to tune the parameter of the system to ones needs. But be aware that the pose of a projected circle within a image (ellipse) has two solutions and only one is published as TF."
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen roscpp rospy dynamic-reconfigure tf image-geometry image-transport nodelet cv-bridge marker-msgs roscpp rospy nodelet dynamic-reconfigure tf image-geometry image-transport cv-bridge marker-msgs"

RDEPENDS_${PN} = "roscpp rospy nodelet dynamic-reconfigure tf image-geometry image-transport cv-bridge marker-msgs"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_ellipses/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03e13bdbd3d6dd4f90863a66bddd5d48"
SRC_URI[sha256sum] = "6f40eb7c0d83f05f8dac8ce03ca8fd2c6a30876e06174e16d80d8909b84d8749"

ROS_SPN = "tuw_marker_detection"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_ellipses-0.1.1-1"

inherit catkin
