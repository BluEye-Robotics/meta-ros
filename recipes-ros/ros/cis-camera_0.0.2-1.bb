DESCRIPTION = "The cis_camera package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp camera-info-manager dynamic-reconfigure image-transport libuvc pluginlib nodelet sensor-msgs rostest cv-bridge pcl-ros tf roscpp"

RDEPENDS_${PN} = "roscpp rgbd-launch camera-info-manager dynamic-reconfigure image-transport libuvc pluginlib nodelet sensor-msgs jsk-rviz-plugins cv-bridge pcl-ros tf"

SRC_URI = "https://github.com/tork-a/cis_camera-release/archive/release/melodic/cis_camera/0.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8640b372c8abaac57ae0d7967439524a"
SRC_URI[sha256sum] = "18ffbbf2db559dc5d40901fca12f090227ff041da9c9b38e09ab1f3f02767cbd"

S = "${WORKDIR}/cis_camera-release-release-melodic-cis_camera-0.0.2-1"

inherit catkin
