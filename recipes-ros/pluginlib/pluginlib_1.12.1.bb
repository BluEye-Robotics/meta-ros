DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins \
using the ROS build infrastructure."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost class-loader rosconsole roslib libtinyxml2"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "57f7274b80b7262b6199f49ad7b8b8f3"
SRC_URI[sha256sum] = "28d63fe6de613e52876bdb9c2263f5ca982fe7dd6d40ed7976178801b9aaf9fb"

inherit catkin

# libclass_loader.so: error: undefined reference to 'pthread_mutexattr_destroy', 'pthread_mutexattr_settype', 'pthread_mutexattr_init'
LDFLAGS_append = "${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', ' -fuse-ld=bfd ', '', d)}"
