// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.avutil.*;
import static org.bytedeco.javacpp.swresample.*;
import static org.bytedeco.javacpp.avcodec.*;

public class avformat extends org.bytedeco.javacpp.presets.avformat {
    static { Loader.load(); }

// Parsed from <libavformat/avio.h>

/*
 * copyright (c) 2001 Fabrice Bellard
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
// #ifndef AVFORMAT_AVIO_H
// #define AVFORMAT_AVIO_H

/**
 * \file
 * \ingroup lavf_io
 * Buffered I/O operations
 */

// #include <stdint.h>

// #include "libavutil/common.h"
// #include "libavutil/dict.h"
// #include "libavutil/log.h"

// #include "libavformat/version.h"

/** Seeking works like for a local file */
public static final int AVIO_SEEKABLE_NORMAL = 0x0001;

/**
 * Callback for checking whether to abort blocking functions.
 * AVERROR_EXIT is returned in this case by the interrupted
 * function. During blocking operations, callback is called with
 * opaque as parameter. If the callback returns 1, the
 * blocking operation will be aborted.
 *
 * No members can be added to this struct without a major bump, if
 * new elements have been added after this struct in AVFormatContext
 * or AVIOContext.
 */
public static class AVIOInterruptCB extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIOInterruptCB() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVIOInterruptCB(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIOInterruptCB(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVIOInterruptCB position(int position) {
        return (AVIOInterruptCB)super.position(position);
    }

    public static class Callback_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Callback_Pointer(Pointer p) { super(p); }
        protected Callback_Pointer() { allocate(); }
        private native void allocate();
        public native int call(Pointer arg0);
    }
    public native Callback_Pointer callback(); public native AVIOInterruptCB callback(Callback_Pointer callback);
    public native Pointer opaque(); public native AVIOInterruptCB opaque(Pointer opaque);
}

/**
 * Directory entry types.
 */
/** enum AVIODirEntryType */
public static final int
    AVIO_ENTRY_UNKNOWN = 0,
    AVIO_ENTRY_BLOCK_DEVICE = 1,
    AVIO_ENTRY_CHARACTER_DEVICE = 2,
    AVIO_ENTRY_DIRECTORY = 3,
    AVIO_ENTRY_NAMED_PIPE = 4,
    AVIO_ENTRY_SYMBOLIC_LINK = 5,
    AVIO_ENTRY_SOCKET = 6,
    AVIO_ENTRY_FILE = 7,
    AVIO_ENTRY_SERVER = 8,
    AVIO_ENTRY_SHARE = 9,
    AVIO_ENTRY_WORKGROUP = 10;

/**
 * Describes single entry of the directory.
 *
 * Only name and type fields are guaranteed be set.
 * Rest of fields are protocol or/and platform dependent and might be unknown.
 */
public static class AVIODirEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIODirEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVIODirEntry(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIODirEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVIODirEntry position(int position) {
        return (AVIODirEntry)super.position(position);
    }

    /** Filename */
    public native @Cast("char*") BytePointer name(); public native AVIODirEntry name(BytePointer name);
    /** Type of the entry */
    public native int type(); public native AVIODirEntry type(int type);
    /** Set to 1 when name is encoded with UTF-8, 0 otherwise.
                                                   Name can be encoded with UTF-8 even though 0 is set. */
    public native int utf8(); public native AVIODirEntry utf8(int utf8);
    /** File size in bytes, -1 if unknown. */
    public native long size(); public native AVIODirEntry size(long size);
    /** Time of last modification in microseconds since unix
                                                   epoch, -1 if unknown. */
    public native long modification_timestamp(); public native AVIODirEntry modification_timestamp(long modification_timestamp);
    /** Time of last access in microseconds since unix epoch,
                                                   -1 if unknown. */
    public native long access_timestamp(); public native AVIODirEntry access_timestamp(long access_timestamp);
    /** Time of last status change in microseconds since unix
                                                   epoch, -1 if unknown. */
    public native long status_change_timestamp(); public native AVIODirEntry status_change_timestamp(long status_change_timestamp);
    /** User ID of owner, -1 if unknown. */
    public native long user_id(); public native AVIODirEntry user_id(long user_id);
    /** Group ID of owner, -1 if unknown. */
    public native long group_id(); public native AVIODirEntry group_id(long group_id);
    /** Unix file mode, -1 if unknown. */
    public native long filemode(); public native AVIODirEntry filemode(long filemode);
}

public static class AVIODirContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIODirContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVIODirContext(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIODirContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVIODirContext position(int position) {
        return (AVIODirContext)super.position(position);
    }

    public native @Cast("URLContext*") Pointer url_context(); public native AVIODirContext url_context(Pointer url_context);
}

/**
 * Bytestream IO Context.
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVIOContext) must not be used outside libav*.
 *
 * \note None of the function pointers in AVIOContext should be called
 *       directly, they should only be set by the client application
 *       when implementing custom I/O. Normally these are set to the
 *       function pointers specified in avio_alloc_context()
 */
public static class AVIOContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIOContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVIOContext(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIOContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVIOContext position(int position) {
        return (AVIOContext)super.position(position);
    }

    /**
     * A class for private options.
     *
     * If this AVIOContext is created by avio_open2(), av_class is set and
     * passes the options down to protocols.
     *
     * If this AVIOContext is manually allocated, then av_class may be set by
     * the caller.
     *
     * warning -- this field can be NULL, be sure to not pass this AVIOContext
     * to any av_opt_* functions in that case.
     */
    @MemberGetter public native @Const AVClass av_class();
    /** Start of the buffer. */
    public native @Cast("unsigned char*") BytePointer buffer(); public native AVIOContext buffer(BytePointer buffer);
    /** Maximum buffer size */
    public native int buffer_size(); public native AVIOContext buffer_size(int buffer_size);
    /** Current position in the buffer */
    public native @Cast("unsigned char*") BytePointer buf_ptr(); public native AVIOContext buf_ptr(BytePointer buf_ptr);
    /** End of the data, may be less than
                                     buffer+buffer_size if the read function returned
                                     less data than requested, e.g. for streams where
                                     no more data has been received yet. */
    public native @Cast("unsigned char*") BytePointer buf_end(); public native AVIOContext buf_end(BytePointer buf_end);
    /** A private pointer, passed to the read/write/seek/...
                                     functions. */
    public native Pointer opaque(); public native AVIOContext opaque(Pointer opaque);
    public static class Read_packet_Pointer_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
        protected Read_packet_Pointer_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
    }
    public native Read_packet_Pointer_BytePointer_int read_packet(); public native AVIOContext read_packet(Read_packet_Pointer_BytePointer_int read_packet);
    public static class Write_packet_Pointer_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
        protected Write_packet_Pointer_BytePointer_int() { allocate(); }
        private native void allocate();
        public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
    }
    public native Write_packet_Pointer_BytePointer_int write_packet(); public native AVIOContext write_packet(Write_packet_Pointer_BytePointer_int write_packet);
    public static class Seek_Pointer_long_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Seek_Pointer_long_int(Pointer p) { super(p); }
        protected Seek_Pointer_long_int() { allocate(); }
        private native void allocate();
        public native long call(Pointer opaque, long offset, int whence);
    }
    public native Seek_Pointer_long_int seek(); public native AVIOContext seek(Seek_Pointer_long_int seek);
    /** position in the file of the current buffer */
    public native long pos(); public native AVIOContext pos(long pos);
    /** true if the next seek should flush */
    public native int must_flush(); public native AVIOContext must_flush(int must_flush);
    /** true if eof reached */
    public native int eof_reached(); public native AVIOContext eof_reached(int eof_reached);
    /** true if open for writing */
    public native int write_flag(); public native AVIOContext write_flag(int write_flag);
    public native int max_packet_size(); public native AVIOContext max_packet_size(int max_packet_size);
    public native @Cast("unsigned long") long checksum(); public native AVIOContext checksum(long checksum);
    public native @Cast("unsigned char*") BytePointer checksum_ptr(); public native AVIOContext checksum_ptr(BytePointer checksum_ptr);
    public static class Update_checksum_long_BytePointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Update_checksum_long_BytePointer_int(Pointer p) { super(p); }
        protected Update_checksum_long_BytePointer_int() { allocate(); }
        private native void allocate();
        public native @Cast("unsigned long") long call(@Cast("unsigned long") long checksum, @Cast("const uint8_t*") BytePointer buf, @Cast("unsigned int") int size);
    }
    public native Update_checksum_long_BytePointer_int update_checksum(); public native AVIOContext update_checksum(Update_checksum_long_BytePointer_int update_checksum);
    /** contains the error code or 0 if no error happened */
    public native int error(); public native AVIOContext error(int error);
    /**
     * Pause or resume playback for network streaming protocols - e.g. MMS.
     */
    public static class Read_pause_Pointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_pause_Pointer_int(Pointer p) { super(p); }
        protected Read_pause_Pointer_int() { allocate(); }
        private native void allocate();
        public native int call(Pointer opaque, int pause);
    }
    public native Read_pause_Pointer_int read_pause(); public native AVIOContext read_pause(Read_pause_Pointer_int read_pause);
    /**
     * Seek to a given timestamp in stream with the specified stream_index.
     * Needed for some network streaming protocols which don't support seeking
     * to byte position.
     */
    public static class Read_seek_Pointer_int_long_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_seek_Pointer_int_long_int(Pointer p) { super(p); }
        protected Read_seek_Pointer_int_long_int() { allocate(); }
        private native void allocate();
        public native long call(Pointer opaque, int stream_index,
                             long timestamp, int flags);
    }
    public native Read_seek_Pointer_int_long_int read_seek(); public native AVIOContext read_seek(Read_seek_Pointer_int_long_int read_seek);
    /**
     * A combination of AVIO_SEEKABLE_ flags or 0 when the stream is not seekable.
     */
    public native int seekable(); public native AVIOContext seekable(int seekable);

    /**
     * max filesize, used to limit allocations
     * This field is internal to libavformat and access from outside is not allowed.
     */
    public native long maxsize(); public native AVIOContext maxsize(long maxsize);

    /**
     * avio_read and avio_write should if possible be satisfied directly
     * instead of going through a buffer, and avio_seek will always
     * call the underlying seek function directly.
     */
    public native int direct(); public native AVIOContext direct(int direct);

    /**
     * Bytes read statistic
     * This field is internal to libavformat and access from outside is not allowed.
     */
    public native long bytes_read(); public native AVIOContext bytes_read(long bytes_read);

    /**
     * seek statistic
     * This field is internal to libavformat and access from outside is not allowed.
     */
    public native int seek_count(); public native AVIOContext seek_count(int seek_count);

    /**
     * writeout statistic
     * This field is internal to libavformat and access from outside is not allowed.
     */
    public native int writeout_count(); public native AVIOContext writeout_count(int writeout_count);

    /**
     * Original buffer size
     * used internally after probing and ensure seekback to reset the buffer size
     * This field is internal to libavformat and access from outside is not allowed.
     */
    public native int orig_buffer_size(); public native AVIOContext orig_buffer_size(int orig_buffer_size);

    /**
     * Threshold to favor readahead over seek.
     * This is current internal only, do not use from outside.
     */
    public native int short_seek_threshold(); public native AVIOContext short_seek_threshold(int short_seek_threshold);
}

/* unbuffered I/O */

/**
 * Return the name of the protocol that will handle the passed URL.
 *
 * NULL is returned if no protocol could be found for the given URL.
 *
 * @return Name of the protocol or NULL.
 */
public static native @Cast("const char*") BytePointer avio_find_protocol_name(@Cast("const char*") BytePointer url);
public static native String avio_find_protocol_name(String url);

/**
 * Return AVIO_FLAG_* access flags corresponding to the access permissions
 * of the resource in url, or a negative value corresponding to an
 * AVERROR code in case of failure. The returned access flags are
 * masked by the value in flags.
 *
 * \note This function is intrinsically unsafe, in the sense that the
 * checked resource may change its existence or permission status from
 * one call to another. Thus you should not trust the returned value,
 * unless you are sure that no other processes are accessing the
 * checked resource.
 */
public static native int avio_check(@Cast("const char*") BytePointer url, int flags);
public static native int avio_check(String url, int flags);

/**
 * Move or rename a resource.
 *
 * \note url_src and url_dst should share the same protocol and authority.
 *
 * @param url_src url to resource to be moved
 * @param url_dst new url to resource if the operation succeeded
 * @return >=0 on success or negative on error.
 */
public static native int avpriv_io_move(@Cast("const char*") BytePointer url_src, @Cast("const char*") BytePointer url_dst);
public static native int avpriv_io_move(String url_src, String url_dst);

/**
 * Delete a resource.
 *
 * @param url resource to be deleted.
 * @return >=0 on success or negative on error.
 */
public static native int avpriv_io_delete(@Cast("const char*") BytePointer url);
public static native int avpriv_io_delete(String url);

/**
 * Open directory for reading.
 *
 * @param s       directory read context. Pointer to a NULL pointer must be passed.
 * @param url     directory to be listed.
 * @param options A dictionary filled with protocol-private options. On return
 *                this parameter will be destroyed and replaced with a dictionary
 *                containing options that were not found. May be NULL.
 * @return >=0 on success or negative on error.
 */
public static native int avio_open_dir(@Cast("AVIODirContext**") PointerPointer s, @Cast("const char*") BytePointer url, @Cast("AVDictionary**") PointerPointer options);
public static native int avio_open_dir(@ByPtrPtr AVIODirContext s, @Cast("const char*") BytePointer url, @ByPtrPtr AVDictionary options);
public static native int avio_open_dir(@ByPtrPtr AVIODirContext s, String url, @ByPtrPtr AVDictionary options);

/**
 * Get next directory entry.
 *
 * Returned entry must be freed with avio_free_directory_entry(). In particular
 * it may outlive AVIODirContext.
 *
 * @param s         directory read context.
 * @param [out] next next entry or NULL when no more entries.
 * @return >=0 on success or negative on error. End of list is not considered an
 *             error.
 */
public static native int avio_read_dir(AVIODirContext s, @Cast("AVIODirEntry**") PointerPointer next);
public static native int avio_read_dir(AVIODirContext s, @ByPtrPtr AVIODirEntry next);

/**
 * Close directory.
 *
 * \note Entries created using avio_read_dir() are not deleted and must be
 * freeded with avio_free_directory_entry().
 *
 * @param s         directory read context.
 * @return >=0 on success or negative on error.
 */
public static native int avio_close_dir(@Cast("AVIODirContext**") PointerPointer s);
public static native int avio_close_dir(@ByPtrPtr AVIODirContext s);

/**
 * Free entry allocated by avio_read_dir().
 *
 * @param entry entry to be freed.
 */
public static native void avio_free_directory_entry(@Cast("AVIODirEntry**") PointerPointer entry);
public static native void avio_free_directory_entry(@ByPtrPtr AVIODirEntry entry);

/**
 * Allocate and initialize an AVIOContext for buffered I/O. It must be later
 * freed with av_free().
 *
 * @param buffer Memory block for input/output operations via AVIOContext.
 *        The buffer must be allocated with av_malloc() and friends.
 *        It may be freed and replaced with a new buffer by libavformat.
 *        AVIOContext.buffer holds the buffer currently in use,
 *        which must be later freed with av_free().
 * @param buffer_size The buffer size is very important for performance.
 *        For protocols with fixed blocksize it should be set to this blocksize.
 *        For others a typical size is a cache page, e.g. 4kb.
 * @param write_flag Set to 1 if the buffer should be writable, 0 otherwise.
 * @param opaque An opaque pointer to user-specific data.
 * @param read_packet  A function for refilling the buffer, may be NULL.
 * @param write_packet A function for writing the buffer contents, may be NULL.
 *        The function may not change the input buffers content.
 * @param seek A function for seeking to specified byte position, may be NULL.
 *
 * @return Allocated AVIOContext or NULL on failure.
 */
public static class Read_packet_Pointer_BytePointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Read_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
    protected Read_packet_Pointer_BytePointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
}
public static class Write_packet_Pointer_BytePointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Write_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
    protected Write_packet_Pointer_BytePointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
}
public static class Seek_Pointer_long_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Seek_Pointer_long_int(Pointer p) { super(p); }
    protected Seek_Pointer_long_int() { allocate(); }
    private native void allocate();
    public native long call(Pointer opaque, long offset, int whence);
}
public static native AVIOContext avio_alloc_context(
                  @Cast("unsigned char*") BytePointer buffer,
                  int buffer_size,
                  int write_flag,
                  Pointer opaque,
                  Read_packet_Pointer_BytePointer_int read_packet,
                  Write_packet_Pointer_BytePointer_int write_packet,
                  Seek_Pointer_long_int seek);
public static class Read_packet_Pointer_ByteBuffer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Read_packet_Pointer_ByteBuffer_int(Pointer p) { super(p); }
    protected Read_packet_Pointer_ByteBuffer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") ByteBuffer buf, int buf_size);
}
public static class Write_packet_Pointer_ByteBuffer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Write_packet_Pointer_ByteBuffer_int(Pointer p) { super(p); }
    protected Write_packet_Pointer_ByteBuffer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") ByteBuffer buf, int buf_size);
}
public static native AVIOContext avio_alloc_context(
                  @Cast("unsigned char*") ByteBuffer buffer,
                  int buffer_size,
                  int write_flag,
                  Pointer opaque,
                  Read_packet_Pointer_ByteBuffer_int read_packet,
                  Write_packet_Pointer_ByteBuffer_int write_packet,
                  Seek_Pointer_long_int seek);
public static class Read_packet_Pointer_byte___int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Read_packet_Pointer_byte___int(Pointer p) { super(p); }
    protected Read_packet_Pointer_byte___int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") byte[] buf, int buf_size);
}
public static class Write_packet_Pointer_byte___int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Write_packet_Pointer_byte___int(Pointer p) { super(p); }
    protected Write_packet_Pointer_byte___int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") byte[] buf, int buf_size);
}
public static native AVIOContext avio_alloc_context(
                  @Cast("unsigned char*") byte[] buffer,
                  int buffer_size,
                  int write_flag,
                  Pointer opaque,
                  Read_packet_Pointer_byte___int read_packet,
                  Write_packet_Pointer_byte___int write_packet,
                  Seek_Pointer_long_int seek);

public static native void avio_w8(AVIOContext s, int b);
public static native void avio_write(AVIOContext s, @Cast("const unsigned char*") BytePointer buf, int size);
public static native void avio_write(AVIOContext s, @Cast("const unsigned char*") ByteBuffer buf, int size);
public static native void avio_write(AVIOContext s, @Cast("const unsigned char*") byte[] buf, int size);
public static native void avio_wl64(AVIOContext s, @Cast("uint64_t") long val);
public static native void avio_wb64(AVIOContext s, @Cast("uint64_t") long val);
public static native void avio_wl32(AVIOContext s, @Cast("unsigned int") int val);
public static native void avio_wb32(AVIOContext s, @Cast("unsigned int") int val);
public static native void avio_wl24(AVIOContext s, @Cast("unsigned int") int val);
public static native void avio_wb24(AVIOContext s, @Cast("unsigned int") int val);
public static native void avio_wl16(AVIOContext s, @Cast("unsigned int") int val);
public static native void avio_wb16(AVIOContext s, @Cast("unsigned int") int val);

/**
 * Write a NULL-terminated string.
 * @return number of bytes written.
 */
public static native int avio_put_str(AVIOContext s, @Cast("const char*") BytePointer str);
public static native int avio_put_str(AVIOContext s, String str);

/**
 * Convert an UTF-8 string to UTF-16LE and write it.
 * @param s the AVIOContext
 * @param str NULL-terminated UTF-8 string
 *
 * @return number of bytes written.
 */
public static native int avio_put_str16le(AVIOContext s, @Cast("const char*") BytePointer str);
public static native int avio_put_str16le(AVIOContext s, String str);

/**
 * Convert an UTF-8 string to UTF-16BE and write it.
 * @param s the AVIOContext
 * @param str NULL-terminated UTF-8 string
 *
 * @return number of bytes written.
 */
public static native int avio_put_str16be(AVIOContext s, @Cast("const char*") BytePointer str);
public static native int avio_put_str16be(AVIOContext s, String str);

/**
 * Passing this as the "whence" parameter to a seek function causes it to
 * return the filesize without seeking anywhere. Supporting this is optional.
 * If it is not supported then the seek function will return <0.
 */
public static final int AVSEEK_SIZE = 0x10000;

/**
 * Oring this flag as into the "whence" parameter to a seek function causes it to
 * seek by any means (like reopening and linear reading) or other normally unreasonable
 * means that can be extremely slow.
 * This may be ignored by the seek code.
 */
public static final int AVSEEK_FORCE = 0x20000;

/**
 * fseek() equivalent for AVIOContext.
 * @return new position or AVERROR.
 */
public static native long avio_seek(AVIOContext s, long offset, int whence);

/**
 * Skip given number of bytes forward
 * @return new position or AVERROR.
 */
public static native long avio_skip(AVIOContext s, long offset);

/**
 * ftell() equivalent for AVIOContext.
 * @return position or AVERROR.
 */
public static native long avio_tell(AVIOContext s);

/**
 * Get the filesize.
 * @return filesize or AVERROR
 */
public static native long avio_size(AVIOContext s);

/**
 * feof() equivalent for AVIOContext.
 * @return non zero if and only if end of file
 */
public static native int avio_feof(AVIOContext s);
// #if FF_API_URL_FEOF
/**
 * @deprecated use avio_feof()
 */
public static native @Deprecated int url_feof(AVIOContext s);
// #endif

/** \warning currently size is limited */
public static native int avio_printf(AVIOContext s, @Cast("const char*") BytePointer fmt);
public static native int avio_printf(AVIOContext s, String fmt);

/**
 * Force flushing of buffered data.
 *
 * For write streams, force the buffered data to be immediately written to the output,
 * without to wait to fill the internal buffer.
 *
 * For read streams, discard all currently buffered data, and advance the
 * reported file position to that of the underlying stream. This does not
 * read new data, and does not perform any seeks.
 */
public static native void avio_flush(AVIOContext s);

/**
 * Read size bytes from AVIOContext into buf.
 * @return number of bytes read or AVERROR
 */
public static native int avio_read(AVIOContext s, @Cast("unsigned char*") BytePointer buf, int size);
public static native int avio_read(AVIOContext s, @Cast("unsigned char*") ByteBuffer buf, int size);
public static native int avio_read(AVIOContext s, @Cast("unsigned char*") byte[] buf, int size);

/**
 * \name Functions for reading from AVIOContext
 * \{
 *
 * \note return 0 if EOF, so you cannot use it if EOF handling is
 *       necessary
 */
public static native int avio_r8(AVIOContext s);
public static native @Cast("unsigned int") int avio_rl16(AVIOContext s);
public static native @Cast("unsigned int") int avio_rl24(AVIOContext s);
public static native @Cast("unsigned int") int avio_rl32(AVIOContext s);
public static native @Cast("uint64_t") long avio_rl64(AVIOContext s);
public static native @Cast("unsigned int") int avio_rb16(AVIOContext s);
public static native @Cast("unsigned int") int avio_rb24(AVIOContext s);
public static native @Cast("unsigned int") int avio_rb32(AVIOContext s);
public static native @Cast("uint64_t") long avio_rb64(AVIOContext s);
/**
 * \}
 */

/**
 * Read a string from pb into buf. The reading will terminate when either
 * a NULL character was encountered, maxlen bytes have been read, or nothing
 * more can be read from pb. The result is guaranteed to be NULL-terminated, it
 * will be truncated if buf is too small.
 * Note that the string is not interpreted or validated in any way, it
 * might get truncated in the middle of a sequence for multi-byte encodings.
 *
 * @return number of bytes read (is always <= maxlen).
 * If reading ends on EOF or error, the return value will be one more than
 * bytes actually read.
 */
public static native int avio_get_str(AVIOContext pb, int maxlen, @Cast("char*") BytePointer buf, int buflen);
public static native int avio_get_str(AVIOContext pb, int maxlen, @Cast("char*") ByteBuffer buf, int buflen);
public static native int avio_get_str(AVIOContext pb, int maxlen, @Cast("char*") byte[] buf, int buflen);

/**
 * Read a UTF-16 string from pb and convert it to UTF-8.
 * The reading will terminate when either a null or invalid character was
 * encountered or maxlen bytes have been read.
 * @return number of bytes read (is always <= maxlen)
 */
public static native int avio_get_str16le(AVIOContext pb, int maxlen, @Cast("char*") BytePointer buf, int buflen);
public static native int avio_get_str16le(AVIOContext pb, int maxlen, @Cast("char*") ByteBuffer buf, int buflen);
public static native int avio_get_str16le(AVIOContext pb, int maxlen, @Cast("char*") byte[] buf, int buflen);
public static native int avio_get_str16be(AVIOContext pb, int maxlen, @Cast("char*") BytePointer buf, int buflen);
public static native int avio_get_str16be(AVIOContext pb, int maxlen, @Cast("char*") ByteBuffer buf, int buflen);
public static native int avio_get_str16be(AVIOContext pb, int maxlen, @Cast("char*") byte[] buf, int buflen);


/**
 * \name URL open modes
 * The flags argument to avio_open must be one of the following
 * constants, optionally ORed with other flags.
 * \{
 */
/** read-only */
public static final int AVIO_FLAG_READ =  1;
/** write-only */
public static final int AVIO_FLAG_WRITE = 2;
/** read-write pseudo flag */
public static final int AVIO_FLAG_READ_WRITE = (AVIO_FLAG_READ|AVIO_FLAG_WRITE);
/**
 * \}
 */

/**
 * Use non-blocking mode.
 * If this flag is set, operations on the context will return
 * AVERROR(EAGAIN) if they can not be performed immediately.
 * If this flag is not set, operations on the context will never return
 * AVERROR(EAGAIN).
 * Note that this flag does not affect the opening/connecting of the
 * context. Connecting a protocol will always block if necessary (e.g. on
 * network protocols) but never hang (e.g. on busy devices).
 * Warning: non-blocking protocols is work-in-progress; this flag may be
 * silently ignored.
 */
public static final int AVIO_FLAG_NONBLOCK = 8;

/**
 * Use direct mode.
 * avio_read and avio_write should if possible be satisfied directly
 * instead of going through a buffer, and avio_seek will always
 * call the underlying seek function directly.
 */
public static final int AVIO_FLAG_DIRECT = 0x8000;

/**
 * Create and initialize a AVIOContext for accessing the
 * resource indicated by url.
 * \note When the resource indicated by url has been opened in
 * read+write mode, the AVIOContext can be used only for writing.
 *
 * @param s Used to return the pointer to the created AVIOContext.
 * In case of failure the pointed to value is set to NULL.
 * @param url resource to access
 * @param flags flags which control how the resource indicated by url
 * is to be opened
 * @return >= 0 in case of success, a negative value corresponding to an
 * AVERROR code in case of failure
 */
public static native int avio_open(@Cast("AVIOContext**") PointerPointer s, @Cast("const char*") BytePointer url, int flags);
public static native int avio_open(@ByPtrPtr AVIOContext s, @Cast("const char*") BytePointer url, int flags);
public static native int avio_open(@ByPtrPtr AVIOContext s, String url, int flags);

/**
 * Create and initialize a AVIOContext for accessing the
 * resource indicated by url.
 * \note When the resource indicated by url has been opened in
 * read+write mode, the AVIOContext can be used only for writing.
 *
 * @param s Used to return the pointer to the created AVIOContext.
 * In case of failure the pointed to value is set to NULL.
 * @param url resource to access
 * @param flags flags which control how the resource indicated by url
 * is to be opened
 * @param int_cb an interrupt callback to be used at the protocols level
 * @param options  A dictionary filled with protocol-private options. On return
 * this parameter will be destroyed and replaced with a dict containing options
 * that were not found. May be NULL.
 * @return >= 0 in case of success, a negative value corresponding to an
 * AVERROR code in case of failure
 */
public static native int avio_open2(@Cast("AVIOContext**") PointerPointer s, @Cast("const char*") BytePointer url, int flags,
               @Const AVIOInterruptCB int_cb, @Cast("AVDictionary**") PointerPointer options);
public static native int avio_open2(@ByPtrPtr AVIOContext s, @Cast("const char*") BytePointer url, int flags,
               @Const AVIOInterruptCB int_cb, @ByPtrPtr AVDictionary options);
public static native int avio_open2(@ByPtrPtr AVIOContext s, String url, int flags,
               @Const AVIOInterruptCB int_cb, @ByPtrPtr AVDictionary options);

/**
 * Close the resource accessed by the AVIOContext s and free it.
 * This function can only be used if s was opened by avio_open().
 *
 * The internal buffer is automatically flushed before closing the
 * resource.
 *
 * @return 0 on success, an AVERROR < 0 on error.
 * @see avio_closep
 */
public static native int avio_close(AVIOContext s);

/**
 * Close the resource accessed by the AVIOContext *s, free it
 * and set the pointer pointing to it to NULL.
 * This function can only be used if s was opened by avio_open().
 *
 * The internal buffer is automatically flushed before closing the
 * resource.
 *
 * @return 0 on success, an AVERROR < 0 on error.
 * @see avio_close
 */
public static native int avio_closep(@Cast("AVIOContext**") PointerPointer s);
public static native int avio_closep(@ByPtrPtr AVIOContext s);


/**
 * Open a write only memory stream.
 *
 * @param s new IO context
 * @return zero if no error.
 */
public static native int avio_open_dyn_buf(@Cast("AVIOContext**") PointerPointer s);
public static native int avio_open_dyn_buf(@ByPtrPtr AVIOContext s);

/**
 * Return the written size and a pointer to the buffer. The buffer
 * must be freed with av_free().
 * Padding of AV_INPUT_BUFFER_PADDING_SIZE is added to the buffer.
 *
 * @param s IO context
 * @param pbuffer pointer to a byte buffer
 * @return the length of the byte buffer
 */
public static native int avio_close_dyn_buf(AVIOContext s, @Cast("uint8_t**") PointerPointer pbuffer);
public static native int avio_close_dyn_buf(AVIOContext s, @Cast("uint8_t**") @ByPtrPtr BytePointer pbuffer);
public static native int avio_close_dyn_buf(AVIOContext s, @Cast("uint8_t**") @ByPtrPtr ByteBuffer pbuffer);
public static native int avio_close_dyn_buf(AVIOContext s, @Cast("uint8_t**") @ByPtrPtr byte[] pbuffer);

/**
 * Iterate through names of available protocols.
 *
 * @param opaque A private pointer representing current protocol.
 *        It must be a pointer to NULL on first iteration and will
 *        be updated by successive calls to avio_enum_protocols.
 * @param output If set to 1, iterate over output protocols,
 *               otherwise over input protocols.
 *
 * @return A static string containing the name of current protocol or NULL
 */
public static native @Cast("const char*") BytePointer avio_enum_protocols(@Cast("void**") PointerPointer opaque, int output);
public static native @Cast("const char*") BytePointer avio_enum_protocols(@Cast("void**") @ByPtrPtr Pointer opaque, int output);

/**
 * Pause and resume playing - only meaningful if using a network streaming
 * protocol (e.g. MMS).
 *
 * @param h     IO context from which to call the read_pause function pointer
 * @param pause 1 for pause, 0 for resume
 */
public static native int avio_pause(AVIOContext h, int pause);

/**
 * Seek to a given timestamp relative to some component stream.
 * Only meaningful if using a network streaming protocol (e.g. MMS.).
 *
 * @param h IO context from which to call the seek function pointers
 * @param stream_index The stream index that the timestamp is relative to.
 *        If stream_index is (-1) the timestamp should be in AV_TIME_BASE
 *        units from the beginning of the presentation.
 *        If a stream_index >= 0 is used and the protocol does not support
 *        seeking based on component streams, the call will fail.
 * @param timestamp timestamp in AVStream.time_base units
 *        or if there is no stream specified then in AV_TIME_BASE units.
 * @param flags Optional combination of AVSEEK_FLAG_BACKWARD, AVSEEK_FLAG_BYTE
 *        and AVSEEK_FLAG_ANY. The protocol may silently ignore
 *        AVSEEK_FLAG_BACKWARD and AVSEEK_FLAG_ANY, but AVSEEK_FLAG_BYTE will
 *        fail if used and not supported.
 * @return >= 0 on success
 * @see AVInputFormat::read_seek
 */
public static native long avio_seek_time(AVIOContext h, int stream_index,
                       long timestamp, int flags);

/* Avoid a warning. The header can not be included because it breaks c++. */
@Opaque public static class AVBPrint extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVBPrint() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBPrint(Pointer p) { super(p); }
}

/**
 * Read contents of h into print buffer, up to max_size bytes, or up to EOF.
 *
 * @return 0 for success (max_size bytes read or EOF reached), negative error
 * code otherwise
 */
public static native int avio_read_to_bprint(AVIOContext h, AVBPrint pb, @Cast("size_t") long max_size);

/**
 * Accept and allocate a client context on a server context.
 * @param  s the server context
 * @param  c the client context, must be unallocated
 * @return   >= 0 on success or a negative value corresponding
 *           to an AVERROR on failure
 */
public static native int avio_accept(AVIOContext s, @Cast("AVIOContext**") PointerPointer c);
public static native int avio_accept(AVIOContext s, @ByPtrPtr AVIOContext c);

/**
 * Perform one step of the protocol handshake to accept a new client.
 * This function must be called on a client returned by avio_accept() before
 * using it as a read/write context.
 * It is separate from avio_accept() because it may block.
 * A step of the handshake is defined by places where the application may
 * decide to change the proceedings.
 * For example, on a protocol with a request header and a reply header, each
 * one can constitute a step because the application may use the parameters
 * from the request to change parameters in the reply; or each individual
 * chunk of the request can constitute a step.
 * If the handshake is already finished, avio_handshake() does nothing and
 * returns 0 immediately.
 *
 * @param  c the client context to perform the handshake on
 * @return   0   on a complete and successful handshake
 *           > 0 if the handshake progressed, but is not complete
 *           < 0 for an AVERROR code
 */
public static native int avio_handshake(AVIOContext c);
// #endif /* AVFORMAT_AVIO_H */


// Parsed from <libavformat/avformat.h>

/*
 * copyright (c) 2001 Fabrice Bellard
 *
 * This file is part of FFmpeg.
 *
 * FFmpeg is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * FFmpeg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with FFmpeg; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

// #ifndef AVFORMAT_AVFORMAT_H
// #define AVFORMAT_AVFORMAT_H

/**
 * \file
 * \ingroup libavf
 * Main libavformat public API header
 */

/**
 * \defgroup libavf I/O and Muxing/Demuxing Library
 * \{
 *
 * Libavformat (lavf) is a library for dealing with various media container
 * formats. Its main two purposes are demuxing - i.e. splitting a media file
 * into component streams, and the reverse process of muxing - writing supplied
 * data in a specified container format. It also has an \ref lavf_io
 * "I/O module" which supports a number of protocols for accessing the data (e.g.
 * file, tcp, http and others). Before using lavf, you need to call
 * av_register_all() to register all compiled muxers, demuxers and protocols.
 * Unless you are absolutely sure you won't use libavformat's network
 * capabilities, you should also call avformat_network_init().
 *
 * A supported input format is described by an AVInputFormat struct, conversely
 * an output format is described by AVOutputFormat. You can iterate over all
 * registered input/output formats using the av_iformat_next() /
 * av_oformat_next() functions. The protocols layer is not part of the public
 * API, so you can only get the names of supported protocols with the
 * avio_enum_protocols() function.
 *
 * Main lavf structure used for both muxing and demuxing is AVFormatContext,
 * which exports all information about the file being read or written. As with
 * most Libavformat structures, its size is not part of public ABI, so it cannot be
 * allocated on stack or directly with av_malloc(). To create an
 * AVFormatContext, use avformat_alloc_context() (some functions, like
 * avformat_open_input() might do that for you).
 *
 * Most importantly an AVFormatContext contains:
 * \li the \ref AVFormatContext.iformat "input" or \ref AVFormatContext.oformat
 * "output" format. It is either autodetected or set by user for input;
 * always set by user for output.
 * \li an \ref AVFormatContext.streams "array" of AVStreams, which describe all
 * elementary streams stored in the file. AVStreams are typically referred to
 * using their index in this array.
 * \li an \ref AVFormatContext.pb "I/O context". It is either opened by lavf or
 * set by user for input, always set by user for output (unless you are dealing
 * with an AVFMT_NOFILE format).
 *
 * \section lavf_options Passing options to (de)muxers
 * It is possible to configure lavf muxers and demuxers using the \ref avoptions
 * mechanism. Generic (format-independent) libavformat options are provided by
 * AVFormatContext, they can be examined from a user program by calling
 * av_opt_next() / av_opt_find() on an allocated AVFormatContext (or its AVClass
 * from avformat_get_class()). Private (format-specific) options are provided by
 * AVFormatContext.priv_data if and only if AVInputFormat.priv_class /
 * AVOutputFormat.priv_class of the corresponding format struct is non-NULL.
 * Further options may be provided by the \ref AVFormatContext.pb "I/O context",
 * if its AVClass is non-NULL, and the protocols layer. See the discussion on
 * nesting in \ref avoptions documentation to learn how to access those.
 *
 * \defgroup lavf_decoding Demuxing
 * \{
 * Demuxers read a media file and split it into chunks of data (\em packets). A
 * \ref AVPacket "packet" contains one or more encoded frames which belongs to a
 * single elementary stream. In the lavf API this process is represented by the
 * avformat_open_input() function for opening a file, av_read_frame() for
 * reading a single packet and finally avformat_close_input(), which does the
 * cleanup.
 *
 * \section lavf_decoding_open Opening a media file
 * The minimum information required to open a file is its URL or filename, which
 * is passed to avformat_open_input(), as in the following code:
 * <pre>{@code
 * const char    *url = "in.mp3";
 * AVFormatContext *s = NULL;
 * int ret = avformat_open_input(&s, url, NULL, NULL);
 * if (ret < 0)
 *     abort();
 * }</pre>
 * The above code attempts to allocate an AVFormatContext, open the
 * specified file (autodetecting the format) and read the header, exporting the
 * information stored there into s. Some formats do not have a header or do not
 * store enough information there, so it is recommended that you call the
 * avformat_find_stream_info() function which tries to read and decode a few
 * frames to find missing information.
 *
 * In some cases you might want to preallocate an AVFormatContext yourself with
 * avformat_alloc_context() and do some tweaking on it before passing it to
 * avformat_open_input(). One such case is when you want to use custom functions
 * for reading input data instead of lavf internal I/O layer.
 * To do that, create your own AVIOContext with avio_alloc_context(), passing
 * your reading callbacks to it. Then set the \em pb field of your
 * AVFormatContext to newly created AVIOContext.
 *
 * Since the format of the opened file is in general not known until after
 * avformat_open_input() has returned, it is not possible to set demuxer private
 * options on a preallocated context. Instead, the options should be passed to
 * avformat_open_input() wrapped in an AVDictionary:
 * <pre>{@code
 * AVDictionary *options = NULL;
 * av_dict_set(&options, "video_size", "640x480", 0);
 * av_dict_set(&options, "pixel_format", "rgb24", 0);
 *
 * if (avformat_open_input(&s, url, NULL, &options) < 0)
 *     abort();
 * av_dict_free(&options);
 * }</pre>
 * This code passes the private options 'video_size' and 'pixel_format' to the
 * demuxer. They would be necessary for e.g. the rawvideo demuxer, since it
 * cannot know how to interpret raw video data otherwise. If the format turns
 * out to be something different than raw video, those options will not be
 * recognized by the demuxer and therefore will not be applied. Such unrecognized
 * options are then returned in the options dictionary (recognized options are
 * consumed). The calling program can handle such unrecognized options as it
 * wishes, e.g.
 * <pre>{@code
 * AVDictionaryEntry *e;
 * if (e = av_dict_get(options, "", NULL, AV_DICT_IGNORE_SUFFIX)) {
 *     fprintf(stderr, "Option %s not recognized by the demuxer.\n", e->key);
 *     abort();
 * }
 * }</pre>
 *
 * After you have finished reading the file, you must close it with
 * avformat_close_input(). It will free everything associated with the file.
 *
 * \section lavf_decoding_read Reading from an opened file
 * Reading data from an opened AVFormatContext is done by repeatedly calling
 * av_read_frame() on it. Each call, if successful, will return an AVPacket
 * containing encoded data for one AVStream, identified by
 * AVPacket.stream_index. This packet may be passed straight into the libavcodec
 * decoding functions avcodec_decode_video2(), avcodec_decode_audio4() or
 * avcodec_decode_subtitle2() if the caller wishes to decode the data.
 *
 * AVPacket.pts, AVPacket.dts and AVPacket.duration timing information will be
 * set if known. They may also be unset (i.e. AV_NOPTS_VALUE for
 * pts/dts, 0 for duration) if the stream does not provide them. The timing
 * information will be in AVStream.time_base units, i.e. it has to be
 * multiplied by the timebase to convert them to seconds.
 *
 * If AVPacket.buf is set on the returned packet, then the packet is
 * allocated dynamically and the user may keep it indefinitely.
 * Otherwise, if AVPacket.buf is NULL, the packet data is backed by a
 * static storage somewhere inside the demuxer and the packet is only valid
 * until the next av_read_frame() call or closing the file. If the caller
 * requires a longer lifetime, av_dup_packet() will make an av_malloc()ed copy
 * of it.
 * In both cases, the packet must be freed with av_free_packet() when it is no
 * longer needed.
 *
 * \section lavf_decoding_seek Seeking
 * \}
 *
 * \defgroup lavf_encoding Muxing
 * \{
 * Muxers take encoded data in the form of \ref AVPacket "AVPackets" and write
 * it into files or other output bytestreams in the specified container format.
 *
 * The main API functions for muxing are avformat_write_header() for writing the
 * file header, av_write_frame() / av_interleaved_write_frame() for writing the
 * packets and av_write_trailer() for finalizing the file.
 *
 * At the beginning of the muxing process, the caller must first call
 * avformat_alloc_context() to create a muxing context. The caller then sets up
 * the muxer by filling the various fields in this context:
 *
 * - The \ref AVFormatContext.oformat "oformat" field must be set to select the
 *   muxer that will be used.
 * - Unless the format is of the AVFMT_NOFILE type, the \ref AVFormatContext.pb
 *   "pb" field must be set to an opened IO context, either returned from
 *   avio_open2() or a custom one.
 * - Unless the format is of the AVFMT_NOSTREAMS type, at least one stream must
 *   be created with the avformat_new_stream() function. The caller should fill
 *   the \ref AVStream.codec "stream codec context" information, such as the
 *   codec \ref AVCodecContext.codec_type "type", \ref AVCodecContext.codec_id
 *   "id" and other parameters (e.g. width / height, the pixel or sample format,
 *   etc.) as known. The \ref AVStream.time_base "stream timebase" should
 *   be set to the timebase that the caller desires to use for this stream (note
 *   that the timebase actually used by the muxer can be different, as will be
 *   described later).
 * - It is advised to manually initialize only the relevant fields in
 *   AVCodecContext, rather than using \ref avcodec_copy_context() during
 *   remuxing: there is no guarantee that the codec context values remain valid
 *   for both input and output format contexts.
 * - The caller may fill in additional information, such as \ref
 *   AVFormatContext.metadata "global" or \ref AVStream.metadata "per-stream"
 *   metadata, \ref AVFormatContext.chapters "chapters", \ref
 *   AVFormatContext.programs "programs", etc. as described in the
 *   AVFormatContext documentation. Whether such information will actually be
 *   stored in the output depends on what the container format and the muxer
 *   support.
 *
 * When the muxing context is fully set up, the caller must call
 * avformat_write_header() to initialize the muxer internals and write the file
 * header. Whether anything actually is written to the IO context at this step
 * depends on the muxer, but this function must always be called. Any muxer
 * private options must be passed in the options parameter to this function.
 *
 * The data is then sent to the muxer by repeatedly calling av_write_frame() or
 * av_interleaved_write_frame() (consult those functions' documentation for
 * discussion on the difference between them; only one of them may be used with
 * a single muxing context, they should not be mixed). Do note that the timing
 * information on the packets sent to the muxer must be in the corresponding
 * AVStream's timebase. That timebase is set by the muxer (in the
 * avformat_write_header() step) and may be different from the timebase
 * requested by the caller.
 *
 * Once all the data has been written, the caller must call av_write_trailer()
 * to flush any buffered packets and finalize the output file, then close the IO
 * context (if any) and finally free the muxing context with
 * avformat_free_context().
 * \}
 *
 * \defgroup lavf_io I/O Read/Write
 * \{
 * \section lavf_io_dirlist Directory listing
 * The directory listing API makes it possible to list files on remote servers.
 *
 * Some of possible use cases:
 * - an "open file" dialog to choose files from a remote location,
 * - a recursive media finder providing a player with an ability to play all
 * files from a given directory.
 *
 * \subsection lavf_io_dirlist_open Opening a directory
 * At first, a directory needs to be opened by calling avio_open_dir()
 * supplied with a URL and, optionally, ::AVDictionary containing
 * protocol-specific parameters. The function returns zero or positive
 * integer and allocates AVIODirContext on success.
 *
 * <pre>{@code
 * AVIODirContext *ctx = NULL;
 * if (avio_open_dir(&ctx, "smb://example.com/some_dir", NULL) < 0) {
 *     fprintf(stderr, "Cannot open directory.\n");
 *     abort();
 * }
 * }</pre>
 *
 * This code tries to open a sample directory using smb protocol without
 * any additional parameters.
 *
 * \subsection lavf_io_dirlist_read Reading entries
 * Each directory's entry (i.e. file, another directory, anything else
 * within ::AVIODirEntryType) is represented by AVIODirEntry.
 * Reading consecutive entries from an opened AVIODirContext is done by
 * repeatedly calling avio_read_dir() on it. Each call returns zero or
 * positive integer if successful. Reading can be stopped right after the
 * NULL entry has been read -- it means there are no entries left to be
 * read. The following code reads all entries from a directory associated
 * with ctx and prints their names to standard output.
 * <pre>{@code
 * AVIODirEntry *entry = NULL;
 * for (;;) {
 *     if (avio_read_dir(ctx, &entry) < 0) {
 *         fprintf(stderr, "Cannot list directory.\n");
 *         abort();
 *     }
 *     if (!entry)
 *         break;
 *     printf("%s\n", entry->name);
 *     avio_free_directory_entry(&entry);
 * }
 * }</pre>
 * \}
 *
 * \defgroup lavf_codec Demuxers
 * \{
 * \defgroup lavf_codec_native Native Demuxers
 * \{
 * \}
 * \defgroup lavf_codec_wrappers External library wrappers
 * \{
 * \}
 * \}
 * \defgroup lavf_protos I/O Protocols
 * \{
 * \}
 * \defgroup lavf_internal Internal
 * \{
 * \}
 * \}
 *
 */

// #include <time.h>
// #include <stdio.h>  /* FILE */
// #include "libavcodec/avcodec.h"
// #include "libavutil/dict.h"
// #include "libavutil/log.h"

// #include "avio.h"
// #include "libavformat/version.h"

@Opaque public static class AVDeviceInfoList extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVDeviceInfoList() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDeviceInfoList(Pointer p) { super(p); }
}
@Opaque public static class AVDeviceCapabilitiesQuery extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVDeviceCapabilitiesQuery() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
}

/**
 * \defgroup metadata_api Public Metadata API
 * \{
 * \ingroup libavf
 * The metadata API allows libavformat to export metadata tags to a client
 * application when demuxing. Conversely it allows a client application to
 * set metadata when muxing.
 *
 * Metadata is exported or set as pairs of key/value strings in the 'metadata'
 * fields of the AVFormatContext, AVStream, AVChapter and AVProgram structs
 * using the \ref lavu_dict "AVDictionary" API. Like all strings in FFmpeg,
 * metadata is assumed to be UTF-8 encoded Unicode. Note that metadata
 * exported by demuxers isn't checked to be valid UTF-8 in most cases.
 *
 * Important concepts to keep in mind:
 * -  Keys are unique; there can never be 2 tags with the same key. This is
 *    also meant semantically, i.e., a demuxer should not knowingly produce
 *    several keys that are literally different but semantically identical.
 *    E.g., key=Author5, key=Author6. In this example, all authors must be
 *    placed in the same tag.
 * -  Metadata is flat, not hierarchical; there are no subtags. If you
 *    want to store, e.g., the email address of the child of producer Alice
 *    and actor Bob, that could have key=alice_and_bobs_childs_email_address.
 * -  Several modifiers can be applied to the tag name. This is done by
 *    appending a dash character ('-') and the modifier name in the order
 *    they appear in the list below -- e.g. foo-eng-sort, not foo-sort-eng.
 *    -  language -- a tag whose value is localized for a particular language
 *       is appended with the ISO 639-2/B 3-letter language code.
 *       For example: Author-ger=Michael, Author-eng=Mike
 *       The original/default language is in the unqualified "Author" tag.
 *       A demuxer should set a default if it sets any translated tag.
 *    -  sorting  -- a modified version of a tag that should be used for
 *       sorting will have '-sort' appended. E.g. artist="The Beatles",
 *       artist-sort="Beatles, The".
 * - Some protocols and demuxers support metadata updates. After a successful
 *   call to av_read_packet(), AVFormatContext.event_flags or AVStream.event_flags
 *   will be updated to indicate if metadata changed. In order to detect metadata
 *   changes on a stream, you need to loop through all streams in the AVFormatContext
 *   and check their individual event_flags.
 *
 * -  Demuxers attempt to export metadata in a generic format, however tags
 *    with no generic equivalents are left as they are stored in the container.
 *    Follows a list of generic tag names:
 *
 <pre>{@literal
 album        -- name of the set this work belongs to
 album_artist -- main creator of the set/album, if different from artist.
                 e.g. "Various Artists" for compilation albums.
 artist       -- main creator of the work
 comment      -- any additional description of the file.
 composer     -- who composed the work, if different from artist.
 copyright    -- name of copyright holder.
 creation_time-- date when the file was created, preferably in ISO 8601.
 date         -- date when the work was created, preferably in ISO 8601.
 disc         -- number of a subset, e.g. disc in a multi-disc collection.
 encoder      -- name/settings of the software/hardware that produced the file.
 encoded_by   -- person/group who created the file.
 filename     -- original name of the file.
 genre        -- <self-evident>.
 language     -- main language in which the work is performed, preferably
                 in ISO 639-2 format. Multiple languages can be specified by
                 separating them with commas.
 performer    -- artist who performed the work, if different from artist.
                 E.g for "Also sprach Zarathustra", artist would be "Richard
                 Strauss" and performer "London Philharmonic Orchestra".
 publisher    -- name of the label/publisher.
 service_name     -- name of the service in broadcasting (channel name).
 service_provider -- name of the service provider in broadcasting.
 title        -- name of the work.
 track        -- number of this work in the set, can be in form current/total.
 variant_bitrate -- the total bitrate of the bitrate variant that the current stream is part of
 }</pre>
 *
 * Look in the examples section for an application example how to use the Metadata API.
 *
 * \}
 */

/* packet functions */


/**
 * Allocate and read the payload of a packet and initialize its
 * fields with default values.
 *
 * @param s    associated IO context
 * @param pkt packet
 * @param size desired payload size
 * @return >0 (read size) if OK, AVERROR_xxx otherwise
 */
public static native int av_get_packet(AVIOContext s, AVPacket pkt, int size);


/**
 * Read data and append it to the current content of the AVPacket.
 * If pkt->size is 0 this is identical to av_get_packet.
 * Note that this uses av_grow_packet and thus involves a realloc
 * which is inefficient. Thus this function should only be used
 * when there is no reasonable way to know (an upper bound of)
 * the final size.
 *
 * @param s    associated IO context
 * @param pkt packet
 * @param size amount of data to read
 * @return >0 (read size) if OK, AVERROR_xxx otherwise, previous data
 *         will not be lost even if an error occurs.
 */
public static native int av_append_packet(AVIOContext s, AVPacket pkt, int size);

// #if FF_API_LAVF_FRAC
/*************************************************/
/* fractional numbers for exact pts handling */

/**
 * The exact value of the fractional number is: 'val + num / den'.
 * num is assumed to be 0 <= num < den.
 */
public static class AVFrac extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFrac() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVFrac(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFrac(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVFrac position(int position) {
        return (AVFrac)super.position(position);
    }

    public native long val(); public native AVFrac val(long val);
    public native long num(); public native AVFrac num(long num);
    public native long den(); public native AVFrac den(long den);
}
// #endif

/*************************************************/
/* input/output formats */

@Opaque public static class AVCodecTag extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVCodecTag() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecTag(Pointer p) { super(p); }
}

/**
 * This structure contains the data a format has to probe a file.
 */
public static class AVProbeData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProbeData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVProbeData(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProbeData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVProbeData position(int position) {
        return (AVProbeData)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer filename();
    /** Buffer must have AVPROBE_PADDING_SIZE of extra allocated bytes filled with zero. */
    public native @Cast("unsigned char*") BytePointer buf(); public native AVProbeData buf(BytePointer buf);
    /** Size of buf except extra allocated bytes */
    public native int buf_size(); public native AVProbeData buf_size(int buf_size);
    /** mime_type, when known. */
    @MemberGetter public native @Cast("const char*") BytePointer mime_type();
}

public static native @MemberGetter int AVPROBE_SCORE_RETRY();
public static final int AVPROBE_SCORE_RETRY = AVPROBE_SCORE_RETRY();
public static native @MemberGetter int AVPROBE_SCORE_STREAM_RETRY();
public static final int AVPROBE_SCORE_STREAM_RETRY = AVPROBE_SCORE_STREAM_RETRY();

/** score for file extension */
public static final int AVPROBE_SCORE_EXTENSION =  50;
/** score for file mime type */
public static final int AVPROBE_SCORE_MIME =       75;
/** maximum score */
public static final int AVPROBE_SCORE_MAX =       100;

/** extra allocated bytes at the end of the probe buffer */
public static final int AVPROBE_PADDING_SIZE = 32;

/** Demuxer will use avio_open, no opened file should be provided by the caller. */
public static final int AVFMT_NOFILE =        0x0001;
/** Needs '%d' in filename. */
public static final int AVFMT_NEEDNUMBER =    0x0002;
/** Show format stream IDs numbers. */
public static final int AVFMT_SHOW_IDS =      0x0008;
/** Format wants AVPicture structure for
                                      raw picture data. */
public static final int AVFMT_RAWPICTURE =    0x0020;
/** Format wants global header. */
public static final int AVFMT_GLOBALHEADER =  0x0040;
/** Format does not need / have any timestamps. */
public static final int AVFMT_NOTIMESTAMPS =  0x0080;
/** Use generic index building code. */
public static final int AVFMT_GENERIC_INDEX = 0x0100;
/** Format allows timestamp discontinuities. Note, muxers always require valid (monotone) timestamps */
public static final int AVFMT_TS_DISCONT =    0x0200;
/** Format allows variable fps. */
public static final int AVFMT_VARIABLE_FPS =  0x0400;
/** Format does not need width/height */
public static final int AVFMT_NODIMENSIONS =  0x0800;
/** Format does not require any streams */
public static final int AVFMT_NOSTREAMS =     0x1000;
/** Format does not allow to fall back on binary search via read_timestamp */
public static final int AVFMT_NOBINSEARCH =   0x2000;
/** Format does not allow to fall back on generic search */
public static final int AVFMT_NOGENSEARCH =   0x4000;
/** Format does not allow seeking by bytes */
public static final int AVFMT_NO_BYTE_SEEK =  0x8000;
/** Format allows flushing. If not set, the muxer will not receive a NULL packet in the write_packet function. */
public static final int AVFMT_ALLOW_FLUSH =  0x10000;
// #if LIBAVFORMAT_VERSION_MAJOR <= 54
// #else

/** Format does not require strictly
                                        increasing timestamps, but they must
                                        still be monotonic */
public static final int AVFMT_TS_NONSTRICT = 0x20000;
// #endif
/** Format allows muxing negative
                                        timestamps. If not set the timestamp
                                        will be shifted in av_write_frame and
                                        av_interleaved_write_frame so they
                                        start from 0.
                                        The user or muxer can override this through
                                        AVFormatContext.avoid_negative_ts
                                        */
public static final int AVFMT_TS_NEGATIVE =  0x40000;

/** Seeking is based on PTS */
public static final int AVFMT_SEEK_TO_PTS =   0x4000000;

/**
 * \addtogroup lavf_encoding
 * \{
 */
public static class AVOutputFormat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVOutputFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVOutputFormat(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVOutputFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVOutputFormat position(int position) {
        return (AVOutputFormat)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer name();
    /**
     * Descriptive name for the format, meant to be more human-readable
     * than name. You should use the NULL_IF_CONFIG_SMALL() macro
     * to define it.
     */
    @MemberGetter public native @Cast("const char*") BytePointer long_name();
    @MemberGetter public native @Cast("const char*") BytePointer mime_type();
    /** comma-separated filename extensions */
    @MemberGetter public native @Cast("const char*") BytePointer extensions();
    /* output support */
    /** default audio codec */
    public native @Cast("AVCodecID") int audio_codec(); public native AVOutputFormat audio_codec(int audio_codec);
    /** default video codec */
    public native @Cast("AVCodecID") int video_codec(); public native AVOutputFormat video_codec(int video_codec);
    /** default subtitle codec */
    public native @Cast("AVCodecID") int subtitle_codec(); public native AVOutputFormat subtitle_codec(int subtitle_codec);
    /**
     * can use flags: AVFMT_NOFILE, AVFMT_NEEDNUMBER, AVFMT_RAWPICTURE,
     * AVFMT_GLOBALHEADER, AVFMT_NOTIMESTAMPS, AVFMT_VARIABLE_FPS,
     * AVFMT_NODIMENSIONS, AVFMT_NOSTREAMS, AVFMT_ALLOW_FLUSH,
     * AVFMT_TS_NONSTRICT
     */
    public native int flags(); public native AVOutputFormat flags(int flags);

    /**
     * List of supported codec_id-codec_tag pairs, ordered by "better
     * choice first". The arrays are all terminated by AV_CODEC_ID_NONE.
     */
    @MemberGetter public native @Const AVCodecTag codec_tag(int i);
    @MemberGetter public native @Cast("const AVCodecTag*const*") PointerPointer codec_tag();


    /** AVClass for the private context */
    @MemberGetter public native @Const AVClass priv_class();

    /*****************************************************************
     * No fields below this line are part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    public native AVOutputFormat next(); public native AVOutputFormat next(AVOutputFormat next);
    /**
     * size of private data so that it can be allocated in the wrapper
     */
    public native int priv_data_size(); public native AVOutputFormat priv_data_size(int priv_data_size);

    public static class Write_header_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_header_AVFormatContext(Pointer p) { super(p); }
        protected Write_header_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Write_header_AVFormatContext write_header(); public native AVOutputFormat write_header(Write_header_AVFormatContext write_header);
    /**
     * Write a packet. If AVFMT_ALLOW_FLUSH is set in flags,
     * pkt can be NULL in order to flush data buffered in the muxer.
     * When flushing, return 0 if there still is more data to flush,
     * or 1 if everything was flushed and there is no more buffered
     * data.
     */
    public static class Write_packet_AVFormatContext_AVPacket extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_packet_AVFormatContext_AVPacket(Pointer p) { super(p); }
        protected Write_packet_AVFormatContext_AVPacket() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, AVPacket pkt);
    }
    public native Write_packet_AVFormatContext_AVPacket write_packet(); public native AVOutputFormat write_packet(Write_packet_AVFormatContext_AVPacket write_packet);
    public static class Write_trailer_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_trailer_AVFormatContext(Pointer p) { super(p); }
        protected Write_trailer_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Write_trailer_AVFormatContext write_trailer(); public native AVOutputFormat write_trailer(Write_trailer_AVFormatContext write_trailer);
    /**
     * Currently only used to set pixel format if not YUV420P.
     */
    public static class Interleave_packet_AVFormatContext_AVPacket_AVPacket_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Interleave_packet_AVFormatContext_AVPacket_AVPacket_int(Pointer p) { super(p); }
        protected Interleave_packet_AVFormatContext_AVPacket_AVPacket_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, AVPacket out,
                                 AVPacket in, int flush);
    }
    public native Interleave_packet_AVFormatContext_AVPacket_AVPacket_int interleave_packet(); public native AVOutputFormat interleave_packet(Interleave_packet_AVFormatContext_AVPacket_AVPacket_int interleave_packet);
    /**
     * Test if the given codec can be stored in this container.
     *
     * @return 1 if the codec is supported, 0 if it is not.
     *         A negative number if unknown.
     *         MKTAG('A', 'P', 'I', 'C') if the codec is only supported as AV_DISPOSITION_ATTACHED_PIC
     */
    public static class Query_codec_int_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Query_codec_int_int(Pointer p) { super(p); }
        protected Query_codec_int_int() { allocate(); }
        private native void allocate();
        public native int call(@Cast("AVCodecID") int id, int std_compliance);
    }
    public native Query_codec_int_int query_codec(); public native AVOutputFormat query_codec(Query_codec_int_int query_codec);

    public static class Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer(Pointer p) { super(p); }
        protected Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer() { allocate(); }
        private native void allocate();
        public native void call(AVFormatContext s, int stream,
                                     LongPointer dts, LongPointer wall);
    }
    public native Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer get_output_timestamp(); public native AVOutputFormat get_output_timestamp(Get_output_timestamp_AVFormatContext_int_LongPointer_LongPointer get_output_timestamp);
    /**
     * Allows sending messages from application to device.
     */
    public static class Control_message_AVFormatContext_int_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Control_message_AVFormatContext_int_Pointer_long(Pointer p) { super(p); }
        protected Control_message_AVFormatContext_int_Pointer_long() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, int type,
                               Pointer data, @Cast("size_t") long data_size);
    }
    public native Control_message_AVFormatContext_int_Pointer_long control_message(); public native AVOutputFormat control_message(Control_message_AVFormatContext_int_Pointer_long control_message);

    /**
     * Write an uncoded AVFrame.
     *
     * See av_write_uncoded_frame() for details.
     *
     * The library will free *frame afterwards, but the muxer can prevent it
     * by setting the pointer to NULL.
     */
    public static class Write_uncoded_frame_AVFormatContext_int_PointerPointer_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Write_uncoded_frame_AVFormatContext_int_PointerPointer_int(Pointer p) { super(p); }
        protected Write_uncoded_frame_AVFormatContext_int_PointerPointer_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, int stream_index,
                                   @Cast("AVFrame**") PointerPointer frame, @Cast("unsigned") int flags);
    }
    public native Write_uncoded_frame_AVFormatContext_int_PointerPointer_int write_uncoded_frame(); public native AVOutputFormat write_uncoded_frame(Write_uncoded_frame_AVFormatContext_int_PointerPointer_int write_uncoded_frame);
    /**
     * Returns device list with it properties.
     * @see avdevice_list_devices() for more details.
     */
    public static class Get_device_list_AVFormatContext_AVDeviceInfoList extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_device_list_AVFormatContext_AVDeviceInfoList(Pointer p) { super(p); }
        protected Get_device_list_AVFormatContext_AVDeviceInfoList() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceInfoList device_list);
    }
    public native Get_device_list_AVFormatContext_AVDeviceInfoList get_device_list(); public native AVOutputFormat get_device_list(Get_device_list_AVFormatContext_AVDeviceInfoList get_device_list);
    /**
     * Initialize device capabilities submodule.
     * @see avdevice_capabilities_create() for more details.
     */
    public static class Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
        protected Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceCapabilitiesQuery caps);
    }
    public native Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery create_device_capabilities(); public native AVOutputFormat create_device_capabilities(Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery create_device_capabilities);
    /**
     * Free device capabilities submodule.
     * @see avdevice_capabilities_free() for more details.
     */
    public static class Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
        protected Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceCapabilitiesQuery caps);
    }
    public native Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery free_device_capabilities(); public native AVOutputFormat free_device_capabilities(Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery free_device_capabilities);
    /** default data codec */
    public native @Cast("AVCodecID") int data_codec(); public native AVOutputFormat data_codec(int data_codec);
}
/**
 * \}
 */

/**
 * \addtogroup lavf_decoding
 * \{
 */
public static class AVInputFormat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVInputFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVInputFormat(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVInputFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVInputFormat position(int position) {
        return (AVInputFormat)super.position(position);
    }

    /**
     * A comma separated list of short names for the format. New names
     * may be appended with a minor bump.
     */
    @MemberGetter public native @Cast("const char*") BytePointer name();

    /**
     * Descriptive name for the format, meant to be more human-readable
     * than name. You should use the NULL_IF_CONFIG_SMALL() macro
     * to define it.
     */
    @MemberGetter public native @Cast("const char*") BytePointer long_name();

    /**
     * Can use flags: AVFMT_NOFILE, AVFMT_NEEDNUMBER, AVFMT_SHOW_IDS,
     * AVFMT_GENERIC_INDEX, AVFMT_TS_DISCONT, AVFMT_NOBINSEARCH,
     * AVFMT_NOGENSEARCH, AVFMT_NO_BYTE_SEEK, AVFMT_SEEK_TO_PTS.
     */
    public native int flags(); public native AVInputFormat flags(int flags);

    /**
     * If extensions are defined, then no probe is done. You should
     * usually not use extension format guessing because it is not
     * reliable enough
     */
    @MemberGetter public native @Cast("const char*") BytePointer extensions();

    @MemberGetter public native @Const AVCodecTag codec_tag(int i);
    @MemberGetter public native @Cast("const AVCodecTag*const*") PointerPointer codec_tag();

    /** AVClass for the private context */
    @MemberGetter public native @Const AVClass priv_class();

    /**
     * Comma-separated list of mime types.
     * It is used check for matching mime types while probing.
     * @see av_probe_input_format2
     */
    @MemberGetter public native @Cast("const char*") BytePointer mime_type();

    /*****************************************************************
     * No fields below this line are part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    public native AVInputFormat next(); public native AVInputFormat next(AVInputFormat next);

    /**
     * Raw demuxers store their codec ID here.
     */
    public native int raw_codec_id(); public native AVInputFormat raw_codec_id(int raw_codec_id);

    /**
     * Size of private data so that it can be allocated in the wrapper.
     */
    public native int priv_data_size(); public native AVInputFormat priv_data_size(int priv_data_size);

    /**
     * Tell if a given file has a chance of being parsed as this format.
     * The buffer provided is guaranteed to be AVPROBE_PADDING_SIZE bytes
     * big so you do not have to check for that unless you need more.
     */
    public static class Read_probe_AVProbeData extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_probe_AVProbeData(Pointer p) { super(p); }
        protected Read_probe_AVProbeData() { allocate(); }
        private native void allocate();
        public native int call(AVProbeData arg0);
    }
    public native Read_probe_AVProbeData read_probe(); public native AVInputFormat read_probe(Read_probe_AVProbeData read_probe);

    /**
     * Read the format header and initialize the AVFormatContext
     * structure. Return 0 if OK. 'avformat_new_stream' should be
     * called to create new streams.
     */
    public static class Read_header_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_header_AVFormatContext(Pointer p) { super(p); }
        protected Read_header_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Read_header_AVFormatContext read_header(); public native AVInputFormat read_header(Read_header_AVFormatContext read_header);

    /**
     * Read one packet and put it in 'pkt'. pts and flags are also
     * set. 'avformat_new_stream' can be called only if the flag
     * AVFMTCTX_NOHEADER is used and only in the calling thread (not in a
     * background thread).
     * @return 0 on success, < 0 on error.
     *         When returning an error, pkt must not have been allocated
     *         or must be freed before returning
     */
    public static class Read_packet_AVFormatContext_AVPacket extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_packet_AVFormatContext_AVPacket(Pointer p) { super(p); }
        protected Read_packet_AVFormatContext_AVPacket() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0, AVPacket pkt);
    }
    public native Read_packet_AVFormatContext_AVPacket read_packet(); public native AVInputFormat read_packet(Read_packet_AVFormatContext_AVPacket read_packet);

    /**
     * Close the stream. The AVFormatContext and AVStreams are not
     * freed by this function
     */
    public static class Read_close_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_close_AVFormatContext(Pointer p) { super(p); }
        protected Read_close_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Read_close_AVFormatContext read_close(); public native AVInputFormat read_close(Read_close_AVFormatContext read_close);

    /**
     * Seek to a given timestamp relative to the frames in
     * stream component stream_index.
     * @param stream_index Must not be -1.
     * @param flags Selects which direction should be preferred if no exact
     *              match is available.
     * @return >= 0 on success (but not necessarily the new offset)
     */
    public static class Read_seek_AVFormatContext_int_long_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_seek_AVFormatContext_int_long_int(Pointer p) { super(p); }
        protected Read_seek_AVFormatContext_int_long_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0,
                         int stream_index, long timestamp, int flags);
    }
    public native Read_seek_AVFormatContext_int_long_int read_seek(); public native AVInputFormat read_seek(Read_seek_AVFormatContext_int_long_int read_seek);

    /**
     * Get the next timestamp in stream[stream_index].time_base units.
     * @return the timestamp or AV_NOPTS_VALUE if an error occurred
     */
    public static class Read_timestamp_AVFormatContext_int_LongPointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_timestamp_AVFormatContext_int_LongPointer_long(Pointer p) { super(p); }
        protected Read_timestamp_AVFormatContext_int_LongPointer_long() { allocate(); }
        private native void allocate();
        public native long call(AVFormatContext s, int stream_index,
                                  LongPointer pos, long pos_limit);
    }
    public native Read_timestamp_AVFormatContext_int_LongPointer_long read_timestamp(); public native AVInputFormat read_timestamp(Read_timestamp_AVFormatContext_int_LongPointer_long read_timestamp);

    /**
     * Start/resume playing - only meaningful if using a network-based format
     * (RTSP).
     */
    public static class Read_play_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_play_AVFormatContext(Pointer p) { super(p); }
        protected Read_play_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Read_play_AVFormatContext read_play(); public native AVInputFormat read_play(Read_play_AVFormatContext read_play);

    /**
     * Pause playing - only meaningful if using a network-based format
     * (RTSP).
     */
    public static class Read_pause_AVFormatContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_pause_AVFormatContext(Pointer p) { super(p); }
        protected Read_pause_AVFormatContext() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext arg0);
    }
    public native Read_pause_AVFormatContext read_pause(); public native AVInputFormat read_pause(Read_pause_AVFormatContext read_pause);

    /**
     * Seek to timestamp ts.
     * Seeking will be done so that the point from which all active streams
     * can be presented successfully will be closest to ts and within min/max_ts.
     * Active streams are all streams that have AVStream.discard < AVDISCARD_ALL.
     */
    public static class Read_seek2_AVFormatContext_int_long_long_long_int extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Read_seek2_AVFormatContext_int_long_long_long_int(Pointer p) { super(p); }
        protected Read_seek2_AVFormatContext_int_long_long_long_int() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, int stream_index, long min_ts, long ts, long max_ts, int flags);
    }
    public native Read_seek2_AVFormatContext_int_long_long_long_int read_seek2(); public native AVInputFormat read_seek2(Read_seek2_AVFormatContext_int_long_long_long_int read_seek2);

    /**
     * Returns device list with it properties.
     * @see avdevice_list_devices() for more details.
     */
    public static class Get_device_list_AVFormatContext_AVDeviceInfoList extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_device_list_AVFormatContext_AVDeviceInfoList(Pointer p) { super(p); }
        protected Get_device_list_AVFormatContext_AVDeviceInfoList() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceInfoList device_list);
    }
    public native Get_device_list_AVFormatContext_AVDeviceInfoList get_device_list(); public native AVInputFormat get_device_list(Get_device_list_AVFormatContext_AVDeviceInfoList get_device_list);

    /**
     * Initialize device capabilities submodule.
     * @see avdevice_capabilities_create() for more details.
     */
    public static class Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
        protected Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceCapabilitiesQuery caps);
    }
    public native Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery create_device_capabilities(); public native AVInputFormat create_device_capabilities(Create_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery create_device_capabilities);

    /**
     * Free device capabilities submodule.
     * @see avdevice_capabilities_free() for more details.
     */
    public static class Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery(Pointer p) { super(p); }
        protected Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, AVDeviceCapabilitiesQuery caps);
    }
    public native Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery free_device_capabilities(); public native AVInputFormat free_device_capabilities(Free_device_capabilities_AVFormatContext_AVDeviceCapabilitiesQuery free_device_capabilities);
}
/**
 * \}
 */

/** enum AVStreamParseType */
public static final int
    AVSTREAM_PARSE_NONE = 0,
    /** full parsing and repack */
    AVSTREAM_PARSE_FULL = 1,
    /** Only parse headers, do not repack. */
    AVSTREAM_PARSE_HEADERS = 2,
    /** full parsing and interpolation of timestamps for frames not starting on a packet boundary */
    AVSTREAM_PARSE_TIMESTAMPS = 3,
    /** full parsing and repack of the first frame only, only implemented for H.264 currently */
    AVSTREAM_PARSE_FULL_ONCE = 4;
public static native @MemberGetter int AVSTREAM_PARSE_FULL_RAW();
public static final int
    /** full parsing and repack with timestamp and position generation by parser for raw
                                                             this assumes that each packet in the file contains no demuxer level headers and
                                                             just codec level data, otherwise position generation would fail */
    AVSTREAM_PARSE_FULL_RAW= AVSTREAM_PARSE_FULL_RAW();

public static class AVIndexEntry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVIndexEntry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVIndexEntry(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVIndexEntry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVIndexEntry position(int position) {
        return (AVIndexEntry)super.position(position);
    }

    public native long pos(); public native AVIndexEntry pos(long pos);
    /**
                                   * Timestamp in AVStream.time_base units, preferably the time from which on correctly decoded frames are available
                                   * when seeking to this entry. That means preferable PTS on keyframe based formats.
                                   * But demuxers can choose to store a different timestamp, if it is more convenient for the implementation or nothing better
                                   * is known
                                   */
    public native long timestamp(); public native AVIndexEntry timestamp(long timestamp);
public static final int AVINDEX_KEYFRAME = 0x0001;
    public native @NoOffset int flags(); public native AVIndexEntry flags(int flags);
    public native @NoOffset int size(); public native AVIndexEntry size(int size); //Yeah, trying to keep the size of this small to reduce memory requirements (it is 24 vs. 32 bytes due to possible 8-byte alignment).
    /** Minimum distance between this and the previous keyframe, used to avoid unneeded searching. */
    public native int min_distance(); public native AVIndexEntry min_distance(int min_distance);
}

public static final int AV_DISPOSITION_DEFAULT =   0x0001;
public static final int AV_DISPOSITION_DUB =       0x0002;
public static final int AV_DISPOSITION_ORIGINAL =  0x0004;
public static final int AV_DISPOSITION_COMMENT =   0x0008;
public static final int AV_DISPOSITION_LYRICS =    0x0010;
public static final int AV_DISPOSITION_KARAOKE =   0x0020;

/**
 * Track should be used during playback by default.
 * Useful for subtitle track that should be displayed
 * even when user did not explicitly ask for subtitles.
 */
public static final int AV_DISPOSITION_FORCED =    0x0040;
/** stream for hearing impaired audiences */
public static final int AV_DISPOSITION_HEARING_IMPAIRED =  0x0080;
/** stream for visual impaired audiences */
public static final int AV_DISPOSITION_VISUAL_IMPAIRED =   0x0100;
/** stream without voice */
public static final int AV_DISPOSITION_CLEAN_EFFECTS =     0x0200;
/**
 * The stream is stored in the file as an attached picture/"cover art" (e.g.
 * APIC frame in ID3v2). The single packet associated with it will be returned
 * among the first few packets read from the file unless seeking takes place.
 * It can also be accessed at any time in AVStream.attached_pic.
 */
public static final int AV_DISPOSITION_ATTACHED_PIC =      0x0400;

/**
 * To specify text track kind (different from subtitles default).
 */
public static final int AV_DISPOSITION_CAPTIONS =     0x10000;
public static final int AV_DISPOSITION_DESCRIPTIONS = 0x20000;
public static final int AV_DISPOSITION_METADATA =     0x40000;

/**
 * Options for behavior on timestamp wrap detection.
 */
/** ignore the wrap */
public static final int AV_PTS_WRAP_IGNORE =      0;
/** add the format specific offset on wrap detection */
public static final int AV_PTS_WRAP_ADD_OFFSET =  1;
/** subtract the format specific offset on wrap detection */
public static final int AV_PTS_WRAP_SUB_OFFSET =  -1;

/**
 * Stream structure.
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVStream) must not be used outside libav*.
 */
public static class AVStream extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVStream() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVStream(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVStream(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVStream position(int position) {
        return (AVStream)super.position(position);
    }

    /** stream index in AVFormatContext */
    public native int index(); public native AVStream index(int index);
    /**
     * Format-specific stream ID.
     * decoding: set by libavformat
     * encoding: set by the user, replaced by libavformat if left unset
     */
    public native int id(); public native AVStream id(int id);
    /**
     * Codec context associated with this stream. Allocated and freed by
     * libavformat.
     *
     * - decoding: The demuxer exports codec information stored in the headers
     *             here.
     * - encoding: The user sets codec information, the muxer writes it to the
     *             output. Mandatory fields as specified in AVCodecContext
     *             documentation must be set even if this AVCodecContext is
     *             not actually used for encoding.
     */
    public native AVCodecContext codec(); public native AVStream codec(AVCodecContext codec);
    public native Pointer priv_data(); public native AVStream priv_data(Pointer priv_data);

// #if FF_API_LAVF_FRAC
    /**
     * @deprecated this field is unused
     */
    public native @Deprecated @ByRef AVFrac pts(); public native AVStream pts(AVFrac pts);
// #endif

    /**
     * This is the fundamental unit of time (in seconds) in terms
     * of which frame timestamps are represented.
     *
     * decoding: set by libavformat
     * encoding: May be set by the caller before avformat_write_header() to
     *           provide a hint to the muxer about the desired timebase. In
     *           avformat_write_header(), the muxer will overwrite this field
     *           with the timebase that will actually be used for the timestamps
     *           written into the file (which may or may not be related to the
     *           user-provided one, depending on the format).
     */
    public native @ByRef AVRational time_base(); public native AVStream time_base(AVRational time_base);

    /**
     * Decoding: pts of the first frame of the stream in presentation order, in stream time base.
     * Only set this if you are absolutely 100% sure that the value you set
     * it to really is the pts of the first frame.
     * This may be undefined (AV_NOPTS_VALUE).
     * \note The ASF header does NOT contain a correct start_time the ASF
     * demuxer must NOT set this.
     */
    public native long start_time(); public native AVStream start_time(long start_time);

    /**
     * Decoding: duration of the stream, in stream time base.
     * If a source file does not specify a duration, but does specify
     * a bitrate, this value will be estimated from bitrate and file size.
     */
    public native long duration(); public native AVStream duration(long duration);

    /** number of frames in this stream if known or 0 */
    public native long nb_frames(); public native AVStream nb_frames(long nb_frames);

    /** AV_DISPOSITION_* bit field */
    public native int disposition(); public native AVStream disposition(int disposition);

    /** Selects which packets can be discarded at will and do not need to be demuxed. */
    public native @Cast("AVDiscard") int discard(); public native AVStream discard(int discard);

    /**
     * sample aspect ratio (0 if unknown)
     * - encoding: Set by user.
     * - decoding: Set by libavformat.
     */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVStream sample_aspect_ratio(AVRational sample_aspect_ratio);

    public native AVDictionary metadata(); public native AVStream metadata(AVDictionary metadata);

    /**
     * Average framerate
     *
     * - demuxing: May be set by libavformat when creating the stream or in
     *             avformat_find_stream_info().
     * - muxing: May be set by the caller before avformat_write_header().
     */
    public native @ByRef AVRational avg_frame_rate(); public native AVStream avg_frame_rate(AVRational avg_frame_rate);

    /**
     * For streams with AV_DISPOSITION_ATTACHED_PIC disposition, this packet
     * will contain the attached picture.
     *
     * decoding: set by libavformat, must not be modified by the caller.
     * encoding: unused
     */
    public native @ByRef AVPacket attached_pic(); public native AVStream attached_pic(AVPacket attached_pic);

    /**
     * An array of side data that applies to the whole stream (i.e. the
     * container does not allow it to change between packets).
     *
     * There may be no overlap between the side data in this array and side data
     * in the packets. I.e. a given side data is either exported by the muxer
     * (demuxing) / set by the caller (muxing) in this array, then it never
     * appears in the packets, or the side data is exported / sent through
     * the packets (always in the first packet where the value becomes known or
     * changes), then it does not appear in this array.
     *
     * - demuxing: Set by libavformat when the stream is created.
     * - muxing: May be set by the caller before avformat_write_header().
     *
     * Freed by libavformat in avformat_free_context().
     *
     * @see av_format_inject_global_side_data()
     */
    public native AVPacketSideData side_data(); public native AVStream side_data(AVPacketSideData side_data);
    /**
     * The number of elements in the AVStream.side_data array.
     */
    public native int nb_side_data(); public native AVStream nb_side_data(int nb_side_data);

    /**
     * Flags for the user to detect events happening on the stream. Flags must
     * be cleared by the user once the event has been handled.
     * A combination of AVSTREAM_EVENT_FLAG_*.
     */
    public native int event_flags(); public native AVStream event_flags(int event_flags);
/** The call resulted in updated metadata. */
public static final int AVSTREAM_EVENT_FLAG_METADATA_UPDATED = 0x0001;

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */

    /**
     * Stream information used internally by av_find_stream_info()
     */
public static final int MAX_STD_TIMEBASES = (30*12+30+3+6);
        @Name({"info", ".last_dts"}) public native long info_last_dts(int i); public native AVStream info_last_dts(int i, long info_last_dts);
        @Name({"info", ".duration_gcd"}) public native long info_duration_gcd(int i); public native AVStream info_duration_gcd(int i, long info_duration_gcd);
        @Name({"info", ".duration_count"}) public native int info_duration_count(int i); public native AVStream info_duration_count(int i, int info_duration_count);
        @Name({"info", ".rfps_duration_sum"}) public native long info_rfps_duration_sum(int i); public native AVStream info_rfps_duration_sum(int i, long info_rfps_duration_sum);
        @Name({"info", ".duration_error"}) @MemberGetter public native @Cast("double*") DoublePointer info_duration_error(int i);
        @Name({"info", ".codec_info_duration"}) public native long info_codec_info_duration(int i); public native AVStream info_codec_info_duration(int i, long info_codec_info_duration);
        @Name({"info", ".codec_info_duration_fields"}) public native long info_codec_info_duration_fields(int i); public native AVStream info_codec_info_duration_fields(int i, long info_codec_info_duration_fields);

        /**
         * 0  -> decoder has not been searched for yet.
         * >0 -> decoder found
         * <0 -> decoder with codec_id == -found_decoder has not been found
         */
        @Name({"info", ".found_decoder"}) public native int info_found_decoder(int i); public native AVStream info_found_decoder(int i, int info_found_decoder);

        @Name({"info", ".last_duration"}) public native long info_last_duration(int i); public native AVStream info_last_duration(int i, long info_last_duration);

        /**
         * Those are used for average framerate estimation.
         */
        @Name({"info", ".fps_first_dts"}) public native long info_fps_first_dts(int i); public native AVStream info_fps_first_dts(int i, long info_fps_first_dts);
        @Name({"info", ".fps_first_dts_idx"}) public native int info_fps_first_dts_idx(int i); public native AVStream info_fps_first_dts_idx(int i, int info_fps_first_dts_idx);
        @Name({"info", ".fps_last_dts"}) public native long info_fps_last_dts(int i); public native AVStream info_fps_last_dts(int i, long info_fps_last_dts);
        @Name({"info", ".fps_last_dts_idx"}) public native int info_fps_last_dts_idx(int i); public native AVStream info_fps_last_dts_idx(int i, int info_fps_last_dts_idx);

    /** number of bits in pts (used for wrapping control) */
    public native int pts_wrap_bits(); public native AVStream pts_wrap_bits(int pts_wrap_bits);

    // Timestamp generation support:
    /**
     * Timestamp corresponding to the last dts sync point.
     *
     * Initialized when AVCodecParserContext.dts_sync_point >= 0 and
     * a DTS is received from the underlying container. Otherwise set to
     * AV_NOPTS_VALUE by default.
     */
    public native long first_dts(); public native AVStream first_dts(long first_dts);
    public native long cur_dts(); public native AVStream cur_dts(long cur_dts);
    public native long last_IP_pts(); public native AVStream last_IP_pts(long last_IP_pts);
    public native int last_IP_duration(); public native AVStream last_IP_duration(int last_IP_duration);

    /**
     * Number of packets to buffer for codec probing
     */
    public native int probe_packets(); public native AVStream probe_packets(int probe_packets);

    /**
     * Number of frames that have been demuxed during av_find_stream_info()
     */
    public native int codec_info_nb_frames(); public native AVStream codec_info_nb_frames(int codec_info_nb_frames);

    /* av_read_frame() support */
    public native @Cast("AVStreamParseType") int need_parsing(); public native AVStream need_parsing(int need_parsing);
    public native AVCodecParserContext parser(); public native AVStream parser(AVCodecParserContext parser);

    /**
     * last packet in packet_buffer for this stream when muxing.
     */
    public native AVPacketList last_in_packet_buffer(); public native AVStream last_in_packet_buffer(AVPacketList last_in_packet_buffer);
    public native @ByRef AVProbeData probe_data(); public native AVStream probe_data(AVProbeData probe_data);
public static final int MAX_REORDER_DELAY = 16;
    public native long pts_buffer(int i); public native AVStream pts_buffer(int i, long pts_buffer);
    @MemberGetter public native LongPointer pts_buffer();

    /** Only used if the format does not
                                        support seeking natively. */
    public native AVIndexEntry index_entries(); public native AVStream index_entries(AVIndexEntry index_entries);
    public native int nb_index_entries(); public native AVStream nb_index_entries(int nb_index_entries);
    public native @Cast("unsigned int") int index_entries_allocated_size(); public native AVStream index_entries_allocated_size(int index_entries_allocated_size);

    /**
     * Real base framerate of the stream.
     * This is the lowest framerate with which all timestamps can be
     * represented accurately (it is the least common multiple of all
     * framerates in the stream). Note, this value is just a guess!
     * For example, if the time base is 1/90000 and all frames have either
     * approximately 3600 or 1800 timer ticks, then r_frame_rate will be 50/1.
     *
     * Code outside avformat should access this field using:
     * av_stream_get/set_r_frame_rate(stream)
     */
    public native @ByRef AVRational r_frame_rate(); public native AVStream r_frame_rate(AVRational r_frame_rate);

    /**
     * Stream Identifier
     * This is the MPEG-TS stream identifier +1
     * 0 means unknown
     */
    public native int stream_identifier(); public native AVStream stream_identifier(int stream_identifier);

    public native long interleaver_chunk_size(); public native AVStream interleaver_chunk_size(long interleaver_chunk_size);
    public native long interleaver_chunk_duration(); public native AVStream interleaver_chunk_duration(long interleaver_chunk_duration);

    /**
     * stream probing state
     * -1   -> probing finished
     *  0   -> no probing requested
     * rest -> perform probing with request_probe being the minimum score to accept.
     * NOT PART OF PUBLIC API
     */
    public native int request_probe(); public native AVStream request_probe(int request_probe);
    /**
     * Indicates that everything up to the next keyframe
     * should be discarded.
     */
    public native int skip_to_keyframe(); public native AVStream skip_to_keyframe(int skip_to_keyframe);

    /**
     * Number of samples to skip at the start of the frame decoded from the next packet.
     */
    public native int skip_samples(); public native AVStream skip_samples(int skip_samples);

    /**
     * If not 0, the number of samples that should be skipped from the start of
     * the stream (the samples are removed from packets with pts==0, which also
     * assumes negative timestamps do not happen).
     * Intended for use with formats such as mp3 with ad-hoc gapless audio
     * support.
     */
    public native long start_skip_samples(); public native AVStream start_skip_samples(long start_skip_samples);

    /**
     * If not 0, the first audio sample that should be discarded from the stream.
     * This is broken by design (needs global sample count), but can't be
     * avoided for broken by design formats such as mp3 with ad-hoc gapless
     * audio support.
     */
    public native long first_discard_sample(); public native AVStream first_discard_sample(long first_discard_sample);

    /**
     * The sample after last sample that is intended to be discarded after
     * first_discard_sample. Works on frame boundaries only. Used to prevent
     * early EOF if the gapless info is broken (considered concatenated mp3s).
     */
    public native long last_discard_sample(); public native AVStream last_discard_sample(long last_discard_sample);

    /**
     * Number of internally decoded frames, used internally in libavformat, do not access
     * its lifetime differs from info which is why it is not in that structure.
     */
    public native int nb_decoded_frames(); public native AVStream nb_decoded_frames(int nb_decoded_frames);

    /**
     * Timestamp offset added to timestamps before muxing
     * NOT PART OF PUBLIC API
     */
    public native long mux_ts_offset(); public native AVStream mux_ts_offset(long mux_ts_offset);

    /**
     * Internal data to check for wrapping of the time stamp
     */
    public native long pts_wrap_reference(); public native AVStream pts_wrap_reference(long pts_wrap_reference);

    /**
     * Options for behavior, when a wrap is detected.
     *
     * Defined by AV_PTS_WRAP_ values.
     *
     * If correction is enabled, there are two possibilities:
     * If the first time stamp is near the wrap point, the wrap offset
     * will be subtracted, which will create negative time stamps.
     * Otherwise the offset will be added.
     */
    public native int pts_wrap_behavior(); public native AVStream pts_wrap_behavior(int pts_wrap_behavior);

    /**
     * Internal data to prevent doing update_initial_durations() twice
     */
    public native int update_initial_durations_done(); public native AVStream update_initial_durations_done(int update_initial_durations_done);

    /**
     * Internal data to generate dts from pts
     */
    public native long pts_reorder_error(int i); public native AVStream pts_reorder_error(int i, long pts_reorder_error);
    @MemberGetter public native LongPointer pts_reorder_error();
    public native @Cast("uint8_t") byte pts_reorder_error_count(int i); public native AVStream pts_reorder_error_count(int i, byte pts_reorder_error_count);
    @MemberGetter public native @Cast("uint8_t*") BytePointer pts_reorder_error_count();

    /**
     * Internal data to analyze DTS and detect faulty mpeg streams
     */
    public native long last_dts_for_order_check(); public native AVStream last_dts_for_order_check(long last_dts_for_order_check);
    public native @Cast("uint8_t") byte dts_ordered(); public native AVStream dts_ordered(byte dts_ordered);
    public native @Cast("uint8_t") byte dts_misordered(); public native AVStream dts_misordered(byte dts_misordered);

    /**
     * Internal data to inject global side data
     */
    public native int inject_global_side_data(); public native AVStream inject_global_side_data(int inject_global_side_data);

    /**
     * String containing paris of key and values describing recommended encoder configuration.
     * Paris are separated by ','.
     * Keys are separated from values by '='.
     */
    public native @Cast("char*") BytePointer recommended_encoder_configuration(); public native AVStream recommended_encoder_configuration(BytePointer recommended_encoder_configuration);

    /**
     * display aspect ratio (0 if unknown)
     * - encoding: unused
     * - decoding: Set by libavformat to calculate sample_aspect_ratio internally
     */
    public native @ByRef AVRational display_aspect_ratio(); public native AVStream display_aspect_ratio(AVRational display_aspect_ratio);

    public native @Cast("FFFrac*") Pointer priv_pts(); public native AVStream priv_pts(Pointer priv_pts);
}

public static native @ByVal AVRational av_stream_get_r_frame_rate(@Const AVStream s);
public static native void av_stream_set_r_frame_rate(AVStream s, @ByVal AVRational r);
public static native AVCodecParserContext av_stream_get_parser(@Const AVStream s);
public static native @Cast("char*") BytePointer av_stream_get_recommended_encoder_configuration(@Const AVStream s);
public static native void av_stream_set_recommended_encoder_configuration(AVStream s, @Cast("char*") BytePointer configuration);
public static native void av_stream_set_recommended_encoder_configuration(AVStream s, @Cast("char*") ByteBuffer configuration);
public static native void av_stream_set_recommended_encoder_configuration(AVStream s, @Cast("char*") byte[] configuration);

/**
 * Returns the pts of the last muxed packet + its duration
 *
 * the retuned value is undefined when used with a demuxer.
 */
public static native long av_stream_get_end_pts(@Const AVStream st);

public static final int AV_PROGRAM_RUNNING = 1;

/**
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVProgram) must not be used outside libav*.
 */
public static class AVProgram extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProgram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVProgram(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProgram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVProgram position(int position) {
        return (AVProgram)super.position(position);
    }

    public native int id(); public native AVProgram id(int id);
    public native int flags(); public native AVProgram flags(int flags);
    /** selects which program to discard and which to feed to the caller */
    public native @Cast("AVDiscard") int discard(); public native AVProgram discard(int discard);
    public native @Cast("unsigned int*") IntPointer stream_index(); public native AVProgram stream_index(IntPointer stream_index);
    public native @Cast("unsigned int") int nb_stream_indexes(); public native AVProgram nb_stream_indexes(int nb_stream_indexes);
    public native AVDictionary metadata(); public native AVProgram metadata(AVDictionary metadata);

    public native int program_num(); public native AVProgram program_num(int program_num);
    public native int pmt_pid(); public native AVProgram pmt_pid(int pmt_pid);
    public native int pcr_pid(); public native AVProgram pcr_pid(int pcr_pid);

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    public native long start_time(); public native AVProgram start_time(long start_time);
    public native long end_time(); public native AVProgram end_time(long end_time);

    /** reference dts for wrap detection */
    public native long pts_wrap_reference(); public native AVProgram pts_wrap_reference(long pts_wrap_reference);
    /** behavior on wrap detection */
    public native int pts_wrap_behavior(); public native AVProgram pts_wrap_behavior(int pts_wrap_behavior);
}

/** signal that no header is present
                                         (streams are added dynamically) */
public static final int AVFMTCTX_NOHEADER =      0x0001;

public static class AVChapter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVChapter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVChapter(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVChapter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVChapter position(int position) {
        return (AVChapter)super.position(position);
    }

    /** unique ID to identify the chapter */
    public native int id(); public native AVChapter id(int id);
    /** time base in which the start/end timestamps are specified */
    public native @ByRef AVRational time_base(); public native AVChapter time_base(AVRational time_base);
    /** chapter start/end time in time_base units */
    public native long start(); public native AVChapter start(long start);
    public native long end(); public native AVChapter end(long end);
    public native AVDictionary metadata(); public native AVChapter metadata(AVDictionary metadata);
}


/**
 * Callback used by devices to communicate with application.
 */
public static class av_format_control_message extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    av_format_control_message(Pointer p) { super(p); }
    protected av_format_control_message() { allocate(); }
    private native void allocate();
    public native int call(AVFormatContext s, int type,
                                         Pointer data, @Cast("size_t") long data_size);
}

public static class AVOpenCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    AVOpenCallback(Pointer p) { super(p); }
    protected AVOpenCallback() { allocate(); }
    private native void allocate();
    public native int call(AVFormatContext s, @ByPtrPtr AVIOContext pb, @Cast("const char*") BytePointer url, int flags,
                              @Const AVIOInterruptCB int_cb, @ByPtrPtr AVDictionary options);
}

/**
 * The duration of a video can be estimated through various ways, and this enum can be used
 * to know how the duration was estimated.
 */
/** enum AVDurationEstimationMethod */
public static final int
    /** Duration accurately estimated from PTSes */
    AVFMT_DURATION_FROM_PTS = 0,
    /** Duration estimated from a stream with a known duration */
    AVFMT_DURATION_FROM_STREAM = 1,
    /** Duration estimated from bitrate (less accurate) */
    AVFMT_DURATION_FROM_BITRATE = 2;

@Opaque public static class AVFormatInternal extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVFormatInternal() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFormatInternal(Pointer p) { super(p); }
}

/**
 * Format I/O context.
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVFormatContext) must not be used outside libav*, use
 * avformat_alloc_context() to create an AVFormatContext.
 */
public static class AVFormatContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFormatContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVFormatContext(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFormatContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVFormatContext position(int position) {
        return (AVFormatContext)super.position(position);
    }

    /**
     * A class for logging and \ref avoptions. Set by avformat_alloc_context().
     * Exports (de)muxer private options if they exist.
     */
    @MemberGetter public native @Const AVClass av_class();

    /**
     * The input container format.
     *
     * Demuxing only, set by avformat_open_input().
     */
    public native AVInputFormat iformat(); public native AVFormatContext iformat(AVInputFormat iformat);

    /**
     * The output container format.
     *
     * Muxing only, must be set by the caller before avformat_write_header().
     */
    public native AVOutputFormat oformat(); public native AVFormatContext oformat(AVOutputFormat oformat);

    /**
     * Format private data. This is an AVOptions-enabled struct
     * if and only if iformat/oformat.priv_class is not NULL.
     *
     * - muxing: set by avformat_write_header()
     * - demuxing: set by avformat_open_input()
     */
    public native Pointer priv_data(); public native AVFormatContext priv_data(Pointer priv_data);

    /**
     * I/O context.
     *
     * - demuxing: either set by the user before avformat_open_input() (then
     *             the user must close it manually) or set by avformat_open_input().
     * - muxing: set by the user before avformat_write_header(). The caller must
     *           take care of closing / freeing the IO context.
     *
     * Do NOT set this field if AVFMT_NOFILE flag is set in
     * iformat/oformat.flags. In such a case, the (de)muxer will handle
     * I/O in some other way and this field will be NULL.
     */
    public native AVIOContext pb(); public native AVFormatContext pb(AVIOContext pb);

    /* stream info */
    /**
     * Flags signalling stream properties. A combination of AVFMTCTX_*.
     * Set by libavformat.
     */
    public native int ctx_flags(); public native AVFormatContext ctx_flags(int ctx_flags);

    /**
     * Number of elements in AVFormatContext.streams.
     *
     * Set by avformat_new_stream(), must not be modified by any other code.
     */
    public native @Cast("unsigned int") int nb_streams(); public native AVFormatContext nb_streams(int nb_streams);
    /**
     * A list of all streams in the file. New streams are created with
     * avformat_new_stream().
     *
     * - demuxing: streams are created by libavformat in avformat_open_input().
     *             If AVFMTCTX_NOHEADER is set in ctx_flags, then new streams may also
     *             appear in av_read_frame().
     * - muxing: streams are created by the user before avformat_write_header().
     *
     * Freed by libavformat in avformat_free_context().
     */
    public native AVStream streams(int i); public native AVFormatContext streams(int i, AVStream streams);
    @MemberGetter public native @Cast("AVStream**") PointerPointer streams();

    /**
     * input or output filename
     *
     * - demuxing: set by avformat_open_input()
     * - muxing: may be set by the caller before avformat_write_header()
     */
    public native @Cast("char") byte filename(int i); public native AVFormatContext filename(int i, byte filename);
    @MemberGetter public native @Cast("char*") BytePointer filename();

    /**
     * Position of the first frame of the component, in
     * AV_TIME_BASE fractional seconds. NEVER set this value directly:
     * It is deduced from the AVStream values.
     *
     * Demuxing only, set by libavformat.
     */
    public native long start_time(); public native AVFormatContext start_time(long start_time);

    /**
     * Duration of the stream, in AV_TIME_BASE fractional
     * seconds. Only set this value if you know none of the individual stream
     * durations and also do not set any of them. This is deduced from the
     * AVStream values if not set.
     *
     * Demuxing only, set by libavformat.
     */
    public native long duration(); public native AVFormatContext duration(long duration);

    /**
     * Total stream bitrate in bit/s, 0 if not
     * available. Never set it directly if the file_size and the
     * duration are known as FFmpeg can compute it automatically.
     */
    public native int bit_rate(); public native AVFormatContext bit_rate(int bit_rate);

    public native @Cast("unsigned int") int packet_size(); public native AVFormatContext packet_size(int packet_size);
    public native int max_delay(); public native AVFormatContext max_delay(int max_delay);

    /**
     * Flags modifying the (de)muxer behaviour. A combination of AVFMT_FLAG_*.
     * Set by the user before avformat_open_input() / avformat_write_header().
     */
    public native int flags(); public native AVFormatContext flags(int flags);
/** Generate missing pts even if it requires parsing future frames. */
public static final int AVFMT_FLAG_GENPTS =       0x0001;
/** Ignore index. */
public static final int AVFMT_FLAG_IGNIDX =       0x0002;
/** Do not block when reading packets from input. */
public static final int AVFMT_FLAG_NONBLOCK =     0x0004;
/** Ignore DTS on frames that contain both DTS & PTS */
public static final int AVFMT_FLAG_IGNDTS =       0x0008;
/** Do not infer any values from other values, just return what is stored in the container */
public static final int AVFMT_FLAG_NOFILLIN =     0x0010;
/** Do not use AVParsers, you also must set AVFMT_FLAG_NOFILLIN as the fillin code works on frames and no parsing -> no frames. Also seeking to frames can not work if parsing to find frame boundaries has been disabled */
public static final int AVFMT_FLAG_NOPARSE =      0x0020;
/** Do not buffer frames when possible */
public static final int AVFMT_FLAG_NOBUFFER =     0x0040;
/** The caller has supplied a custom AVIOContext, don't avio_close() it. */
public static final int AVFMT_FLAG_CUSTOM_IO =    0x0080;
/** Discard frames marked corrupted */
public static final int AVFMT_FLAG_DISCARD_CORRUPT =  0x0100;
/** Flush the AVIOContext every packet. */
public static final int AVFMT_FLAG_FLUSH_PACKETS =    0x0200;
/**
 * When muxing, try to avoid writing any random/volatile data to the output.
 * This includes any random IDs, real-time timestamps/dates, muxer version, etc.
 *
 * This flag is mainly intended for testing.
 */
public static final int AVFMT_FLAG_BITEXACT =         0x0400;
/** Enable RTP MP4A-LATM payload */
public static final int AVFMT_FLAG_MP4A_LATM =    0x8000;
/** try to interleave outputted packets by dts (using this flag can slow demuxing down) */
public static final int AVFMT_FLAG_SORT_DTS =    0x10000;
/** Enable use of private options by delaying codec open (this could be made default once all code is converted) */
public static final int AVFMT_FLAG_PRIV_OPT =    0x20000;
/** Don't merge side data but keep it separate. */
public static final int AVFMT_FLAG_KEEP_SIDE_DATA = 0x40000;
/** Enable fast, but inaccurate seeks for some formats */
public static final int AVFMT_FLAG_FAST_SEEK =   0x80000;

// #if FF_API_PROBESIZE_32
    /**
     * @deprecated deprecated in favor of probesize2
     */
    public native @Cast("unsigned int") int probesize(); public native AVFormatContext probesize(int probesize);

    /**
     * @deprecated deprecated in favor of max_analyze_duration2
     */
    public native @Deprecated int max_analyze_duration(); public native AVFormatContext max_analyze_duration(int max_analyze_duration);
// #endif

    @MemberGetter public native @Cast("const uint8_t*") BytePointer key();
    public native int keylen(); public native AVFormatContext keylen(int keylen);

    public native @Cast("unsigned int") int nb_programs(); public native AVFormatContext nb_programs(int nb_programs);
    public native AVProgram programs(int i); public native AVFormatContext programs(int i, AVProgram programs);
    @MemberGetter public native @Cast("AVProgram**") PointerPointer programs();

    /**
     * Forced video codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int video_codec_id(); public native AVFormatContext video_codec_id(int video_codec_id);

    /**
     * Forced audio codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int audio_codec_id(); public native AVFormatContext audio_codec_id(int audio_codec_id);

    /**
     * Forced subtitle codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int subtitle_codec_id(); public native AVFormatContext subtitle_codec_id(int subtitle_codec_id);

    /**
     * Maximum amount of memory in bytes to use for the index of each stream.
     * If the index exceeds this size, entries will be discarded as
     * needed to maintain a smaller size. This can lead to slower or less
     * accurate seeking (depends on demuxer).
     * Demuxers for which a full in-memory index is mandatory will ignore
     * this.
     * - muxing: unused
     * - demuxing: set by user
     */
    public native @Cast("unsigned int") int max_index_size(); public native AVFormatContext max_index_size(int max_index_size);

    /**
     * Maximum amount of memory in bytes to use for buffering frames
     * obtained from realtime capture devices.
     */
    public native @Cast("unsigned int") int max_picture_buffer(); public native AVFormatContext max_picture_buffer(int max_picture_buffer);

    /**
     * Number of chapters in AVChapter array.
     * When muxing, chapters are normally written in the file header,
     * so nb_chapters should normally be initialized before write_header
     * is called. Some muxers (e.g. mov and mkv) can also write chapters
     * in the trailer.  To write chapters in the trailer, nb_chapters
     * must be zero when write_header is called and non-zero when
     * write_trailer is called.
     * - muxing: set by user
     * - demuxing: set by libavformat
     */
    public native @Cast("unsigned int") int nb_chapters(); public native AVFormatContext nb_chapters(int nb_chapters);
    public native AVChapter chapters(int i); public native AVFormatContext chapters(int i, AVChapter chapters);
    @MemberGetter public native @Cast("AVChapter**") PointerPointer chapters();

    /**
     * Metadata that applies to the whole file.
     *
     * - demuxing: set by libavformat in avformat_open_input()
     * - muxing: may be set by the caller before avformat_write_header()
     *
     * Freed by libavformat in avformat_free_context().
     */
    public native AVDictionary metadata(); public native AVFormatContext metadata(AVDictionary metadata);

    /**
     * Start time of the stream in real world time, in microseconds
     * since the Unix epoch (00:00 1st January 1970). That is, pts=0 in the
     * stream was captured at this real world time.
     * - muxing: Set by the caller before avformat_write_header(). If set to
     *           either 0 or AV_NOPTS_VALUE, then the current wall-time will
     *           be used.
     * - demuxing: Set by libavformat. AV_NOPTS_VALUE if unknown. Note that
     *             the value may become known after some number of frames
     *             have been received.
     */
    public native long start_time_realtime(); public native AVFormatContext start_time_realtime(long start_time_realtime);

    /**
     * The number of frames used for determining the framerate in
     * avformat_find_stream_info().
     * Demuxing only, set by the caller before avformat_find_stream_info().
     */
    public native int fps_probe_size(); public native AVFormatContext fps_probe_size(int fps_probe_size);

    /**
     * Error recognition; higher values will detect more errors but may
     * misdetect some more or less valid parts as errors.
     * Demuxing only, set by the caller before avformat_open_input().
     */
    public native int error_recognition(); public native AVFormatContext error_recognition(int error_recognition);

    /**
     * Custom interrupt callbacks for the I/O layer.
     *
     * demuxing: set by the user before avformat_open_input().
     * muxing: set by the user before avformat_write_header()
     * (mainly useful for AVFMT_NOFILE formats). The callback
     * should also be passed to avio_open2() if it's used to
     * open the file.
     */
    public native @ByRef AVIOInterruptCB interrupt_callback(); public native AVFormatContext interrupt_callback(AVIOInterruptCB interrupt_callback);

    /**
     * Flags to enable debugging.
     */
    public native int debug(); public native AVFormatContext debug(int debug);
public static final int FF_FDEBUG_TS =        0x0001;

    /**
     * Maximum buffering duration for interleaving.
     *
     * To ensure all the streams are interleaved correctly,
     * av_interleaved_write_frame() will wait until it has at least one packet
     * for each stream before actually writing any packets to the output file.
     * When some streams are "sparse" (i.e. there are large gaps between
     * successive packets), this can result in excessive buffering.
     *
     * This field specifies the maximum difference between the timestamps of the
     * first and the last packet in the muxing queue, above which libavformat
     * will output a packet regardless of whether it has queued a packet for all
     * the streams.
     *
     * Muxing only, set by the caller before avformat_write_header().
     */
    public native long max_interleave_delta(); public native AVFormatContext max_interleave_delta(long max_interleave_delta);

    /**
     * Allow non-standard and experimental extension
     * @see AVCodecContext.strict_std_compliance
     */
    public native int strict_std_compliance(); public native AVFormatContext strict_std_compliance(int strict_std_compliance);

    /**
     * Flags for the user to detect events happening on the file. Flags must
     * be cleared by the user once the event has been handled.
     * A combination of AVFMT_EVENT_FLAG_*.
     */
    public native int event_flags(); public native AVFormatContext event_flags(int event_flags);
/** The call resulted in updated metadata. */
public static final int AVFMT_EVENT_FLAG_METADATA_UPDATED = 0x0001;

    /**
     * Maximum number of packets to read while waiting for the first timestamp.
     * Decoding only.
     */
    public native int max_ts_probe(); public native AVFormatContext max_ts_probe(int max_ts_probe);

    /**
     * Avoid negative timestamps during muxing.
     * Any value of the AVFMT_AVOID_NEG_TS_* constants.
     * Note, this only works when using av_interleaved_write_frame. (interleave_packet_per_dts is in use)
     * - muxing: Set by user
     * - demuxing: unused
     */
    public native int avoid_negative_ts(); public native AVFormatContext avoid_negative_ts(int avoid_negative_ts);
/** Enabled when required by target format */
public static final int AVFMT_AVOID_NEG_TS_AUTO =             -1;
/** Shift timestamps so they are non negative */
public static final int AVFMT_AVOID_NEG_TS_MAKE_NON_NEGATIVE = 1;
/** Shift timestamps so that they start at 0 */
public static final int AVFMT_AVOID_NEG_TS_MAKE_ZERO =         2;

    /**
     * Transport stream id.
     * This will be moved into demuxer private options. Thus no API/ABI compatibility
     */
    public native int ts_id(); public native AVFormatContext ts_id(int ts_id);

    /**
     * Audio preload in microseconds.
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user via AVOptions (NO direct access)
     * - decoding: unused
     */
    public native int audio_preload(); public native AVFormatContext audio_preload(int audio_preload);

    /**
     * Max chunk time in microseconds.
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user via AVOptions (NO direct access)
     * - decoding: unused
     */
    public native int max_chunk_duration(); public native AVFormatContext max_chunk_duration(int max_chunk_duration);

    /**
     * Max chunk size in bytes
     * Note, not all formats support this and unpredictable things may happen if it is used when not supported.
     * - encoding: Set by user via AVOptions (NO direct access)
     * - decoding: unused
     */
    public native int max_chunk_size(); public native AVFormatContext max_chunk_size(int max_chunk_size);

    /**
     * forces the use of wallclock timestamps as pts/dts of packets
     * This has undefined results in the presence of B frames.
     * - encoding: unused
     * - decoding: Set by user via AVOptions (NO direct access)
     */
    public native int use_wallclock_as_timestamps(); public native AVFormatContext use_wallclock_as_timestamps(int use_wallclock_as_timestamps);

    /**
     * avio flags, used to force AVIO_FLAG_DIRECT.
     * - encoding: unused
     * - decoding: Set by user via AVOptions (NO direct access)
     */
    public native int avio_flags(); public native AVFormatContext avio_flags(int avio_flags);

    /**
     * The duration field can be estimated through various ways, and this field can be used
     * to know how the duration was estimated.
     * - encoding: unused
     * - decoding: Read by user via AVOptions (NO direct access)
     */
    public native @Cast("AVDurationEstimationMethod") int duration_estimation_method(); public native AVFormatContext duration_estimation_method(int duration_estimation_method);

    /**
     * Skip initial bytes when opening stream
     * - encoding: unused
     * - decoding: Set by user via AVOptions (NO direct access)
     */
    public native long skip_initial_bytes(); public native AVFormatContext skip_initial_bytes(long skip_initial_bytes);

    /**
     * Correct single timestamp overflows
     * - encoding: unused
     * - decoding: Set by user via AVOptions (NO direct access)
     */
    public native @Cast("unsigned int") int correct_ts_overflow(); public native AVFormatContext correct_ts_overflow(int correct_ts_overflow);

    /**
     * Force seeking to any (also non key) frames.
     * - encoding: unused
     * - decoding: Set by user via AVOptions (NO direct access)
     */
    public native int seek2any(); public native AVFormatContext seek2any(int seek2any);

    /**
     * Flush the I/O context after each packet.
     * - encoding: Set by user via AVOptions (NO direct access)
     * - decoding: unused
     */
    public native int flush_packets(); public native AVFormatContext flush_packets(int flush_packets);

    /**
     * format probing score.
     * The maximal score is AVPROBE_SCORE_MAX, its set when the demuxer probes
     * the format.
     * - encoding: unused
     * - decoding: set by avformat, read by user via av_format_get_probe_score() (NO direct access)
     */
    public native int probe_score(); public native AVFormatContext probe_score(int probe_score);

    /**
     * number of bytes to read maximally to identify format.
     * - encoding: unused
     * - decoding: set by user through AVOPtions (NO direct access)
     */
    public native int format_probesize(); public native AVFormatContext format_probesize(int format_probesize);

    /**
     * ',' separated list of allowed decoders.
     * If NULL then all are allowed
     * - encoding: unused
     * - decoding: set by user through AVOptions (NO direct access)
     */
    public native @Cast("char*") BytePointer codec_whitelist(); public native AVFormatContext codec_whitelist(BytePointer codec_whitelist);

    /**
     * ',' separated list of allowed demuxers.
     * If NULL then all are allowed
     * - encoding: unused
     * - decoding: set by user through AVOptions (NO direct access)
     */
    public native @Cast("char*") BytePointer format_whitelist(); public native AVFormatContext format_whitelist(BytePointer format_whitelist);

    /**
     * An opaque field for libavformat internal usage.
     * Must not be accessed in any way by callers.
     */
    public native AVFormatInternal internal(); public native AVFormatContext internal(AVFormatInternal internal);

    /**
     * IO repositioned flag.
     * This is set by avformat when the underlaying IO context read pointer
     * is repositioned, for example when doing byte based seeking.
     * Demuxers can use the flag to detect such changes.
     */
    public native int io_repositioned(); public native AVFormatContext io_repositioned(int io_repositioned);

    /**
     * Forced video codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user via av_format_set_video_codec (NO direct access).
     */
    public native AVCodec video_codec(); public native AVFormatContext video_codec(AVCodec video_codec);

    /**
     * Forced audio codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user via av_format_set_audio_codec (NO direct access).
     */
    public native AVCodec audio_codec(); public native AVFormatContext audio_codec(AVCodec audio_codec);

    /**
     * Forced subtitle codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user via av_format_set_subtitle_codec (NO direct access).
     */
    public native AVCodec subtitle_codec(); public native AVFormatContext subtitle_codec(AVCodec subtitle_codec);

    /**
     * Forced data codec.
     * This allows forcing a specific decoder, even when there are multiple with
     * the same codec_id.
     * Demuxing: Set by user via av_format_set_data_codec (NO direct access).
     */
    public native AVCodec data_codec(); public native AVFormatContext data_codec(AVCodec data_codec);

    /**
     * Number of bytes to be written as padding in a metadata header.
     * Demuxing: Unused.
     * Muxing: Set by user via av_format_set_metadata_header_padding.
     */
    public native int metadata_header_padding(); public native AVFormatContext metadata_header_padding(int metadata_header_padding);

    /**
     * User data.
     * This is a place for some private data of the user.
     * Mostly usable with control_message_cb or any future callbacks in device's context.
     */
    public native Pointer opaque(); public native AVFormatContext opaque(Pointer opaque);

    /**
     * Callback used by devices to communicate with application.
     */
    public native av_format_control_message control_message_cb(); public native AVFormatContext control_message_cb(av_format_control_message control_message_cb);

    /**
     * Output timestamp offset, in microseconds.
     * Muxing: set by user via AVOptions (NO direct access)
     */
    public native long output_ts_offset(); public native AVFormatContext output_ts_offset(long output_ts_offset);

    /**
     * Maximum duration (in AV_TIME_BASE units) of the data read
     * from input in avformat_find_stream_info().
     * Demuxing only, set by the caller before avformat_find_stream_info()
     * via AVOptions (NO direct access).
     * Can be set to 0 to let avformat choose using a heuristic.
     */
// #if FF_API_PROBESIZE_32
    public native long max_analyze_duration2(); public native AVFormatContext max_analyze_duration2(long max_analyze_duration2);
// #else
// #endif

    /**
     * Maximum size of the data read from input for determining
     * the input container format.
     * Demuxing only, set by the caller before avformat_open_input()
     * via AVOptions (NO direct access).
     */
// #if FF_API_PROBESIZE_32
    public native long probesize2(); public native AVFormatContext probesize2(long probesize2);
// #else
// #endif

    /**
     * dump format separator.
     * can be ", " or "\n      " or anything else
     * Code outside libavformat should access this field using AVOptions
     * (NO direct access).
     * - muxing: Set by user.
     * - demuxing: Set by user.
     */
    public native @Cast("uint8_t*") BytePointer dump_separator(); public native AVFormatContext dump_separator(BytePointer dump_separator);

    /**
     * Forced Data codec_id.
     * Demuxing: Set by user.
     */
    public native @Cast("AVCodecID") int data_codec_id(); public native AVFormatContext data_codec_id(int data_codec_id);

    /**
     * Called to open further IO contexts when needed for demuxing.
     *
     * This can be set by the user application to perform security checks on
     * the URLs before opening them.
     * The function should behave like avio_open2(), AVFormatContext is provided
     * as contextual information and to reach AVFormatContext.opaque.
     *
     * If NULL then some simple checks are used together with avio_open2().
     *
     * Must not be accessed directly from outside avformat.
     * \See av_format_set_open_cb()
     *
     * Demuxing: Set by user.
     */
    public static class Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer(Pointer p) { super(p); }
        protected Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer() { allocate(); }
        private native void allocate();
        public native int call(AVFormatContext s, @Cast("AVIOContext**") PointerPointer p, @Cast("const char*") BytePointer url, int flags, @Const AVIOInterruptCB int_cb, @Cast("AVDictionary**") PointerPointer options);
    }
    public native Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer open_cb(); public native AVFormatContext open_cb(Open_cb_AVFormatContext_PointerPointer_BytePointer_int_AVIOInterruptCB_PointerPointer open_cb);
}

public static native int av_format_get_probe_score(@Const AVFormatContext s);
public static native AVCodec av_format_get_video_codec(@Const AVFormatContext s);
public static native void av_format_set_video_codec(AVFormatContext s, AVCodec c);
public static native AVCodec av_format_get_audio_codec(@Const AVFormatContext s);
public static native void av_format_set_audio_codec(AVFormatContext s, AVCodec c);
public static native AVCodec av_format_get_subtitle_codec(@Const AVFormatContext s);
public static native void av_format_set_subtitle_codec(AVFormatContext s, AVCodec c);
public static native AVCodec av_format_get_data_codec(@Const AVFormatContext s);
public static native void av_format_set_data_codec(AVFormatContext s, AVCodec c);
public static native int av_format_get_metadata_header_padding(@Const AVFormatContext s);
public static native void av_format_set_metadata_header_padding(AVFormatContext s, int c);
public static native Pointer av_format_get_opaque(@Const AVFormatContext s);
public static native void av_format_set_opaque(AVFormatContext s, Pointer opaque);
public static native av_format_control_message av_format_get_control_message_cb(@Const AVFormatContext s);
public static native void av_format_set_control_message_cb(AVFormatContext s, av_format_control_message callback);
public static native AVOpenCallback av_format_get_open_cb(@Const AVFormatContext s);
public static native void av_format_set_open_cb(AVFormatContext s, AVOpenCallback callback);

/**
 * This function will cause global side data to be injected in the next packet
 * of each stream as well as after any subsequent seek.
 */
public static native void av_format_inject_global_side_data(AVFormatContext s);

/**
 * Returns the method used to set ctx->duration.
 *
 * @return AVFMT_DURATION_FROM_PTS, AVFMT_DURATION_FROM_STREAM, or AVFMT_DURATION_FROM_BITRATE.
 */
public static native @Cast("AVDurationEstimationMethod") int av_fmt_ctx_get_duration_estimation_method(@Const AVFormatContext ctx);

public static class AVPacketList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVPacketList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public AVPacketList(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVPacketList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public AVPacketList position(int position) {
        return (AVPacketList)super.position(position);
    }

    public native @ByRef AVPacket pkt(); public native AVPacketList pkt(AVPacket pkt);
    public native AVPacketList next(); public native AVPacketList next(AVPacketList next);
}


/**
 * \defgroup lavf_core Core functions
 * \ingroup libavf
 *
 * Functions for querying libavformat capabilities, allocating core structures,
 * etc.
 * \{
 */

/**
 * Return the LIBAVFORMAT_VERSION_INT constant.
 */
public static native @Cast("unsigned") int avformat_version();

/**
 * Return the libavformat build-time configuration.
 */
public static native @Cast("const char*") BytePointer avformat_configuration();

/**
 * Return the libavformat license.
 */
public static native @Cast("const char*") BytePointer avformat_license();

/**
 * Initialize libavformat and register all the muxers, demuxers and
 * protocols. If you do not call this function, then you can select
 * exactly which formats you want to support.
 *
 * @see av_register_input_format()
 * @see av_register_output_format()
 */
public static native void av_register_all();

public static native void av_register_input_format(AVInputFormat format);
public static native void av_register_output_format(AVOutputFormat format);

/**
 * Do global initialization of network components. This is optional,
 * but recommended, since it avoids the overhead of implicitly
 * doing the setup for each session.
 *
 * Calling this function will become mandatory if using network
 * protocols at some major version bump.
 */
public static native int avformat_network_init();

/**
 * Undo the initialization done by avformat_network_init.
 */
public static native int avformat_network_deinit();

/**
 * If f is NULL, returns the first registered input format,
 * if f is non-NULL, returns the next registered input format after f
 * or NULL if f is the last one.
 */
public static native AVInputFormat av_iformat_next(@Const AVInputFormat f);

/**
 * If f is NULL, returns the first registered output format,
 * if f is non-NULL, returns the next registered output format after f
 * or NULL if f is the last one.
 */
public static native AVOutputFormat av_oformat_next(@Const AVOutputFormat f);

/**
 * Allocate an AVFormatContext.
 * avformat_free_context() can be used to free the context and everything
 * allocated by the framework within it.
 */
public static native AVFormatContext avformat_alloc_context();

/**
 * Free an AVFormatContext and all its streams.
 * @param s context to free
 */
public static native void avformat_free_context(AVFormatContext s);

/**
 * Get the AVClass for AVFormatContext. It can be used in combination with
 * AV_OPT_SEARCH_FAKE_OBJ for examining options.
 *
 * @see av_opt_find().
 */
public static native @Const AVClass avformat_get_class();

/**
 * Add a new stream to a media file.
 *
 * When demuxing, it is called by the demuxer in read_header(). If the
 * flag AVFMTCTX_NOHEADER is set in s.ctx_flags, then it may also
 * be called in read_packet().
 *
 * When muxing, should be called by the user before avformat_write_header().
 *
 * User is required to call avcodec_close() and avformat_free_context() to
 * clean up the allocation by avformat_new_stream().
 *
 * @param s media file handle
 * @param c If non-NULL, the AVCodecContext corresponding to the new stream
 * will be initialized to use this codec. This is needed for e.g. codec-specific
 * defaults to be set, so codec should be provided if it is known.
 *
 * @return newly created stream or NULL on error.
 */
public static native AVStream avformat_new_stream(AVFormatContext s, @Const AVCodec c);

/**
 * Get side information from stream.
 *
 * @param stream stream
 * @param type desired side information type
 * @param size pointer for side information size to store (optional)
 * @return pointer to data if present or NULL otherwise
 */
public static native @Cast("uint8_t*") BytePointer av_stream_get_side_data(AVStream stream,
                                 @Cast("AVPacketSideDataType") int type, IntPointer size);
public static native @Cast("uint8_t*") ByteBuffer av_stream_get_side_data(AVStream stream,
                                 @Cast("AVPacketSideDataType") int type, IntBuffer size);
public static native @Cast("uint8_t*") byte[] av_stream_get_side_data(AVStream stream,
                                 @Cast("AVPacketSideDataType") int type, int[] size);

public static native AVProgram av_new_program(AVFormatContext s, int id);

/**
 * \}
 */


/**
 * Allocate an AVFormatContext for an output format.
 * avformat_free_context() can be used to free the context and
 * everything allocated by the framework within it.
 *
 * @param *ctx is set to the created format context, or to NULL in
 * case of failure
 * @param oformat format to use for allocating the context, if NULL
 * format_name and filename are used instead
 * @param format_name the name of output format to use for allocating the
 * context, if NULL filename is used instead
 * @param filename the name of the filename to use for allocating the
 * context, may be NULL
 * @return >= 0 in case of success, a negative AVERROR code in case of
 * failure
 */
public static native int avformat_alloc_output_context2(@Cast("AVFormatContext**") PointerPointer ctx, AVOutputFormat oformat,
                                   @Cast("const char*") BytePointer format_name, @Cast("const char*") BytePointer filename);
public static native int avformat_alloc_output_context2(@ByPtrPtr AVFormatContext ctx, AVOutputFormat oformat,
                                   @Cast("const char*") BytePointer format_name, @Cast("const char*") BytePointer filename);
public static native int avformat_alloc_output_context2(@ByPtrPtr AVFormatContext ctx, AVOutputFormat oformat,
                                   String format_name, String filename);

/**
 * \addtogroup lavf_decoding
 * \{
 */

/**
 * Find AVInputFormat based on the short name of the input format.
 */
public static native AVInputFormat av_find_input_format(@Cast("const char*") BytePointer short_name);
public static native AVInputFormat av_find_input_format(String short_name);

/**
 * Guess the file format.
 *
 * @param pd        data to be probed
 * @param is_opened Whether the file is already opened; determines whether
 *                  demuxers with or without AVFMT_NOFILE are probed.
 */
public static native AVInputFormat av_probe_input_format(AVProbeData pd, int is_opened);

/**
 * Guess the file format.
 *
 * @param pd        data to be probed
 * @param is_opened Whether the file is already opened; determines whether
 *                  demuxers with or without AVFMT_NOFILE are probed.
 * @param score_max A probe score larger that this is required to accept a
 *                  detection, the variable is set to the actual detection
 *                  score afterwards.
 *                  If the score is <= AVPROBE_SCORE_MAX / 4 it is recommended
 *                  to retry with a larger probe buffer.
 */
public static native AVInputFormat av_probe_input_format2(AVProbeData pd, int is_opened, IntPointer score_max);
public static native AVInputFormat av_probe_input_format2(AVProbeData pd, int is_opened, IntBuffer score_max);
public static native AVInputFormat av_probe_input_format2(AVProbeData pd, int is_opened, int[] score_max);

/**
 * Guess the file format.
 *
 * @param is_opened Whether the file is already opened; determines whether
 *                  demuxers with or without AVFMT_NOFILE are probed.
 * @param score_ret The score of the best detection.
 */
public static native AVInputFormat av_probe_input_format3(AVProbeData pd, int is_opened, IntPointer score_ret);
public static native AVInputFormat av_probe_input_format3(AVProbeData pd, int is_opened, IntBuffer score_ret);
public static native AVInputFormat av_probe_input_format3(AVProbeData pd, int is_opened, int[] score_ret);

/**
 * Probe a bytestream to determine the input format. Each time a probe returns
 * with a score that is too low, the probe buffer size is increased and another
 * attempt is made. When the maximum probe size is reached, the input format
 * with the highest score is returned.
 *
 * @param pb the bytestream to probe
 * @param fmt the input format is put here
 * @param filename the filename of the stream
 * @param logctx the log context
 * @param offset the offset within the bytestream to probe from
 * @param max_probe_size the maximum probe buffer size (zero for default)
 * @return the score in case of success, a negative value corresponding to an
 *         the maximal score is AVPROBE_SCORE_MAX
 * AVERROR code otherwise
 */
public static native int av_probe_input_buffer2(AVIOContext pb, @Cast("AVInputFormat**") PointerPointer fmt,
                           @Cast("const char*") BytePointer filename, Pointer logctx,
                           @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);
public static native int av_probe_input_buffer2(AVIOContext pb, @ByPtrPtr AVInputFormat fmt,
                           @Cast("const char*") BytePointer filename, Pointer logctx,
                           @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);
public static native int av_probe_input_buffer2(AVIOContext pb, @ByPtrPtr AVInputFormat fmt,
                           String filename, Pointer logctx,
                           @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);

/**
 * Like av_probe_input_buffer2() but returns 0 on success
 */
public static native int av_probe_input_buffer(AVIOContext pb, @Cast("AVInputFormat**") PointerPointer fmt,
                          @Cast("const char*") BytePointer filename, Pointer logctx,
                          @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);
public static native int av_probe_input_buffer(AVIOContext pb, @ByPtrPtr AVInputFormat fmt,
                          @Cast("const char*") BytePointer filename, Pointer logctx,
                          @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);
public static native int av_probe_input_buffer(AVIOContext pb, @ByPtrPtr AVInputFormat fmt,
                          String filename, Pointer logctx,
                          @Cast("unsigned int") int offset, @Cast("unsigned int") int max_probe_size);

/**
 * Open an input stream and read the header. The codecs are not opened.
 * The stream must be closed with avformat_close_input().
 *
 * @param ps Pointer to user-supplied AVFormatContext (allocated by avformat_alloc_context).
 *           May be a pointer to NULL, in which case an AVFormatContext is allocated by this
 *           function and written into ps.
 *           Note that a user-supplied AVFormatContext will be freed on failure.
 * @param filename Name of the stream to open.
 * @param fmt If non-NULL, this parameter forces a specific input format.
 *            Otherwise the format is autodetected.
 * @param options  A dictionary filled with AVFormatContext and demuxer-private options.
 *                 On return this parameter will be destroyed and replaced with a dict containing
 *                 options that were not found. May be NULL.
 *
 * @return 0 on success, a negative AVERROR on failure.
 *
 * \note If you want to use custom IO, preallocate the format context and set its pb field.
 */
public static native int avformat_open_input(@Cast("AVFormatContext**") PointerPointer ps, @Cast("const char*") BytePointer filename, AVInputFormat fmt, @Cast("AVDictionary**") PointerPointer options);
public static native int avformat_open_input(@ByPtrPtr AVFormatContext ps, @Cast("const char*") BytePointer filename, AVInputFormat fmt, @ByPtrPtr AVDictionary options);
public static native int avformat_open_input(@ByPtrPtr AVFormatContext ps, String filename, AVInputFormat fmt, @ByPtrPtr AVDictionary options);

public static native @Deprecated int av_demuxer_open(AVFormatContext ic);

/**
 * Read packets of a media file to get stream information. This
 * is useful for file formats with no headers such as MPEG. This
 * function also computes the real framerate in case of MPEG-2 repeat
 * frame mode.
 * The logical file position is not changed by this function;
 * examined packets may be buffered for later processing.
 *
 * @param ic media file handle
 * @param options  If non-NULL, an ic.nb_streams long array of pointers to
 *                 dictionaries, where i-th member contains options for
 *                 codec corresponding to i-th stream.
 *                 On return each dictionary will be filled with options that were not found.
 * @return >=0 if OK, AVERROR_xxx on error
 *
 * \note this function isn't guaranteed to open all the codecs, so
 *       options being non-empty at return is a perfectly normal behavior.
 *
 * \todo Let the user decide somehow what information is needed so that
 *       we do not waste time getting stuff the user does not need.
 */
public static native int avformat_find_stream_info(AVFormatContext ic, @Cast("AVDictionary**") PointerPointer options);
public static native int avformat_find_stream_info(AVFormatContext ic, @ByPtrPtr AVDictionary options);

/**
 * Find the programs which belong to a given stream.
 *
 * @param ic    media file handle
 * @param last  the last found program, the search will start after this
 *              program, or from the beginning if it is NULL
 * @param s     stream index
 * @return the next program which belongs to s, NULL if no program is found or
 *         the last program is not among the programs of ic.
 */
public static native AVProgram av_find_program_from_stream(AVFormatContext ic, AVProgram last, int s);

/**
 * Find the "best" stream in the file.
 * The best stream is determined according to various heuristics as the most
 * likely to be what the user expects.
 * If the decoder parameter is non-NULL, av_find_best_stream will find the
 * default decoder for the stream's codec; streams for which no decoder can
 * be found are ignored.
 *
 * @param ic                media file handle
 * @param type              stream type: video, audio, subtitles, etc.
 * @param wanted_stream_nb  user-requested stream number,
 *                          or -1 for automatic selection
 * @param related_stream    try to find a stream related (eg. in the same
 *                          program) to this one, or -1 if none
 * @param decoder_ret       if non-NULL, returns the decoder for the
 *                          selected stream
 * @param flags             flags; none are currently defined
 * @return  the non-negative stream number in case of success,
 *          AVERROR_STREAM_NOT_FOUND if no stream with the requested type
 *          could be found,
 *          AVERROR_DECODER_NOT_FOUND if streams were found but no decoder
 * \note  If av_find_best_stream returns successfully and decoder_ret is not
 *        NULL, then *decoder_ret is guaranteed to be set to a valid AVCodec.
 */
public static native int av_find_best_stream(AVFormatContext ic,
                        @Cast("AVMediaType") int type,
                        int wanted_stream_nb,
                        int related_stream,
                        @Cast("AVCodec**") PointerPointer decoder_ret,
                        int flags);
public static native int av_find_best_stream(AVFormatContext ic,
                        @Cast("AVMediaType") int type,
                        int wanted_stream_nb,
                        int related_stream,
                        @ByPtrPtr AVCodec decoder_ret,
                        int flags);

/**
 * Return the next frame of a stream.
 * This function returns what is stored in the file, and does not validate
 * that what is there are valid frames for the decoder. It will split what is
 * stored in the file into frames and return one for each call. It will not
 * omit invalid data between valid frames so as to give the decoder the maximum
 * information possible for decoding.
 *
 * If pkt->buf is NULL, then the packet is valid until the next
 * av_read_frame() or until avformat_close_input(). Otherwise the packet
 * is valid indefinitely. In both cases the packet must be freed with
 * av_free_packet when it is no longer needed. For video, the packet contains
 * exactly one frame. For audio, it contains an integer number of frames if each
 * frame has a known fixed size (e.g. PCM or ADPCM data). If the audio frames
 * have a variable size (e.g. MPEG audio), then it contains one frame.
 *
 * pkt->pts, pkt->dts and pkt->duration are always set to correct
 * values in AVStream.time_base units (and guessed if the format cannot
 * provide them). pkt->pts can be AV_NOPTS_VALUE if the video format
 * has B-frames, so it is better to rely on pkt->dts if you do not
 * decompress the payload.
 *
 * @return 0 if OK, < 0 on error or end of file
 */
public static native int av_read_frame(AVFormatContext s, AVPacket pkt);

/**
 * Seek to the keyframe at timestamp.
 * 'timestamp' in 'stream_index'.
 *
 * @param s media file handle
 * @param stream_index If stream_index is (-1), a default
 * stream is selected, and timestamp is automatically converted
 * from AV_TIME_BASE units to the stream specific time_base.
 * @param timestamp Timestamp in AVStream.time_base units
 *        or, if no stream is specified, in AV_TIME_BASE units.
 * @param flags flags which select direction and seeking mode
 * @return >= 0 on success
 */
public static native int av_seek_frame(AVFormatContext s, int stream_index, long timestamp,
                  int flags);

/**
 * Seek to timestamp ts.
 * Seeking will be done so that the point from which all active streams
 * can be presented successfully will be closest to ts and within min/max_ts.
 * Active streams are all streams that have AVStream.discard < AVDISCARD_ALL.
 *
 * If flags contain AVSEEK_FLAG_BYTE, then all timestamps are in bytes and
 * are the file position (this may not be supported by all demuxers).
 * If flags contain AVSEEK_FLAG_FRAME, then all timestamps are in frames
 * in the stream with stream_index (this may not be supported by all demuxers).
 * Otherwise all timestamps are in units of the stream selected by stream_index
 * or if stream_index is -1, in AV_TIME_BASE units.
 * If flags contain AVSEEK_FLAG_ANY, then non-keyframes are treated as
 * keyframes (this may not be supported by all demuxers).
 * If flags contain AVSEEK_FLAG_BACKWARD, it is ignored.
 *
 * @param s media file handle
 * @param stream_index index of the stream which is used as time base reference
 * @param min_ts smallest acceptable timestamp
 * @param ts target timestamp
 * @param max_ts largest acceptable timestamp
 * @param flags flags
 * @return >=0 on success, error code otherwise
 *
 * \note This is part of the new seek API which is still under construction.
 *       Thus do not use this yet. It may change at any time, do not expect
 *       ABI compatibility yet!
 */
public static native int avformat_seek_file(AVFormatContext s, int stream_index, long min_ts, long ts, long max_ts, int flags);

/**
 * Discard all internally buffered data. This can be useful when dealing with
 * discontinuities in the byte stream. Generally works only with formats that
 * can resync. This includes headerless formats like MPEG-TS/TS but should also
 * work with NUT, Ogg and in a limited way AVI for example.
 *
 * The set of streams, the detected duration, stream parameters and codecs do
 * not change when calling this function. If you want a complete reset, it's
 * better to open a new AVFormatContext.
 *
 * This does not flush the AVIOContext (s->pb). If necessary, call
 * avio_flush(s->pb) before calling this function.
 *
 * @param s media file handle
 * @return >=0 on success, error code otherwise
 */
public static native int avformat_flush(AVFormatContext s);

/**
 * Start playing a network-based stream (e.g. RTSP stream) at the
 * current position.
 */
public static native int av_read_play(AVFormatContext s);

/**
 * Pause a network-based stream (e.g. RTSP stream).
 *
 * Use av_read_play() to resume it.
 */
public static native int av_read_pause(AVFormatContext s);

/**
 * Close an opened input AVFormatContext. Free it and all its contents
 * and set *s to NULL.
 */
public static native void avformat_close_input(@Cast("AVFormatContext**") PointerPointer s);
public static native void avformat_close_input(@ByPtrPtr AVFormatContext s);
/**
 * \}
 */

/** seek backward */
public static final int AVSEEK_FLAG_BACKWARD = 1;
/** seeking based on position in bytes */
public static final int AVSEEK_FLAG_BYTE =     2;
/** seek to any frame, even non-keyframes */
public static final int AVSEEK_FLAG_ANY =      4;
/** seeking based on frame number */
public static final int AVSEEK_FLAG_FRAME =    8;

/**
 * \addtogroup lavf_encoding
 * \{
 */
/**
 * Allocate the stream private data and write the stream header to
 * an output media file.
 *
 * @param s Media file handle, must be allocated with avformat_alloc_context().
 *          Its oformat field must be set to the desired output format;
 *          Its pb field must be set to an already opened AVIOContext.
 * @param options  An AVDictionary filled with AVFormatContext and muxer-private options.
 *                 On return this parameter will be destroyed and replaced with a dict containing
 *                 options that were not found. May be NULL.
 *
 * @return 0 on success, negative AVERROR on failure.
 *
 * @see av_opt_find, av_dict_set, avio_open, av_oformat_next.
 */
public static native int avformat_write_header(AVFormatContext s, @Cast("AVDictionary**") PointerPointer options);
public static native int avformat_write_header(AVFormatContext s, @ByPtrPtr AVDictionary options);

/**
 * Write a packet to an output media file.
 *
 * This function passes the packet directly to the muxer, without any buffering
 * or reordering. The caller is responsible for correctly interleaving the
 * packets if the format requires it. Callers that want libavformat to handle
 * the interleaving should call av_interleaved_write_frame() instead of this
 * function.
 *
 * @param s media file handle
 * @param pkt The packet containing the data to be written. Note that unlike
 *            av_interleaved_write_frame(), this function does not take
 *            ownership of the packet passed to it (though some muxers may make
 *            an internal reference to the input packet).
 *            <br>
 *            This parameter can be NULL (at any time, not just at the end), in
 *            order to immediately flush data buffered within the muxer, for
 *            muxers that buffer up data internally before writing it to the
 *            output.
 *            <br>
 *            Packet's \ref AVPacket.stream_index "stream_index" field must be
 *            set to the index of the corresponding stream in \ref
 *            AVFormatContext.streams "s->streams". It is very strongly
 *            recommended that timing information (\ref AVPacket.pts "pts", \ref
 *            AVPacket.dts "dts", \ref AVPacket.duration "duration") is set to
 *            correct values.
 * @return < 0 on error, = 0 if OK, 1 if flushed and there is no more data to flush
 *
 * @see av_interleaved_write_frame()
 */
public static native int av_write_frame(AVFormatContext s, AVPacket pkt);

/**
 * Write a packet to an output media file ensuring correct interleaving.
 *
 * This function will buffer the packets internally as needed to make sure the
 * packets in the output file are properly interleaved in the order of
 * increasing dts. Callers doing their own interleaving should call
 * av_write_frame() instead of this function.
 *
 * @param s media file handle
 * @param pkt The packet containing the data to be written.
 *            <br>
 *            If the packet is reference-counted, this function will take
 *            ownership of this reference and unreference it later when it sees
 *            fit.
 *            The caller must not access the data through this reference after
 *            this function returns. If the packet is not reference-counted,
 *            libavformat will make a copy.
 *            <br>
 *            This parameter can be NULL (at any time, not just at the end), to
 *            flush the interleaving queues.
 *            <br>
 *            Packet's \ref AVPacket.stream_index "stream_index" field must be
 *            set to the index of the corresponding stream in \ref
 *            AVFormatContext.streams "s->streams". It is very strongly
 *            recommended that timing information (\ref AVPacket.pts "pts", \ref
 *            AVPacket.dts "dts", \ref AVPacket.duration "duration") is set to
 *            correct values.
 *
 * @return 0 on success, a negative AVERROR on error. Libavformat will always
 *         take care of freeing the packet, even if this function fails.
 *
 * @see av_write_frame(), AVFormatContext.max_interleave_delta
 */
public static native int av_interleaved_write_frame(AVFormatContext s, AVPacket pkt);

/**
 * Write a uncoded frame to an output media file.
 *
 * The frame must be correctly interleaved according to the container
 * specification; if not, then av_interleaved_write_frame() must be used.
 *
 * See av_interleaved_write_frame() for details.
 */
public static native int av_write_uncoded_frame(AVFormatContext s, int stream_index,
                           AVFrame frame);

/**
 * Write a uncoded frame to an output media file.
 *
 * If the muxer supports it, this function makes it possible to write an AVFrame
 * structure directly, without encoding it into a packet.
 * It is mostly useful for devices and similar special muxers that use raw
 * video or PCM data and will not serialize it into a byte stream.
 *
 * To test whether it is possible to use it with a given muxer and stream,
 * use av_write_uncoded_frame_query().
 *
 * The caller gives up ownership of the frame and must not access it
 * afterwards.
 *
 * @return  >=0 for success, a negative code on error
 */
public static native int av_interleaved_write_uncoded_frame(AVFormatContext s, int stream_index,
                                       AVFrame frame);

/**
 * Test whether a muxer supports uncoded frame.
 *
 * @return  >=0 if an uncoded frame can be written to that muxer and stream,
 *          <0 if not
 */
public static native int av_write_uncoded_frame_query(AVFormatContext s, int stream_index);

/**
 * Write the stream trailer to an output media file and free the
 * file private data.
 *
 * May only be called after a successful call to avformat_write_header.
 *
 * @param s media file handle
 * @return 0 if OK, AVERROR_xxx on error
 */
public static native int av_write_trailer(AVFormatContext s);

/**
 * Return the output format in the list of registered output formats
 * which best matches the provided parameters, or return NULL if
 * there is no match.
 *
 * @param short_name if non-NULL checks if short_name matches with the
 * names of the registered formats
 * @param filename if non-NULL checks if filename terminates with the
 * extensions of the registered formats
 * @param mime_type if non-NULL checks if mime_type matches with the
 * MIME type of the registered formats
 */
public static native AVOutputFormat av_guess_format(@Cast("const char*") BytePointer short_name,
                                @Cast("const char*") BytePointer filename,
                                @Cast("const char*") BytePointer mime_type);
public static native AVOutputFormat av_guess_format(String short_name,
                                String filename,
                                String mime_type);

/**
 * Guess the codec ID based upon muxer and filename.
 */
public static native @Cast("AVCodecID") int av_guess_codec(AVOutputFormat fmt, @Cast("const char*") BytePointer short_name,
                            @Cast("const char*") BytePointer filename, @Cast("const char*") BytePointer mime_type,
                            @Cast("AVMediaType") int type);
public static native @Cast("AVCodecID") int av_guess_codec(AVOutputFormat fmt, String short_name,
                            String filename, String mime_type,
                            @Cast("AVMediaType") int type);

/**
 * Get timing information for the data currently output.
 * The exact meaning of "currently output" depends on the format.
 * It is mostly relevant for devices that have an internal buffer and/or
 * work in real time.
 * @param s          media file handle
 * @param stream     stream in the media file
 * @param [out] dts   DTS of the last packet output for the stream, in stream
 *                   time_base units
 * @param [out] wall  absolute time when that packet whas output,
 *                   in microsecond
 * @return  0 if OK, AVERROR(ENOSYS) if the format does not support it
 * Note: some formats or devices may not allow to measure dts and wall
 * atomically.
 */
public static native int av_get_output_timestamp(AVFormatContext s, int stream,
                            LongPointer dts, LongPointer wall);
public static native int av_get_output_timestamp(AVFormatContext s, int stream,
                            LongBuffer dts, LongBuffer wall);
public static native int av_get_output_timestamp(AVFormatContext s, int stream,
                            long[] dts, long[] wall);


/**
 * \}
 */


/**
 * \defgroup lavf_misc Utility functions
 * \ingroup libavf
 * \{
 *
 * Miscellaneous utility functions related to both muxing and demuxing
 * (or neither).
 */

/**
 * Send a nice hexadecimal dump of a buffer to the specified file stream.
 *
 * @param f The file stream pointer where the dump should be sent to.
 * @param buf buffer
 * @param size buffer size
 *
 * @see av_hex_dump_log, av_pkt_dump2, av_pkt_dump_log2
 */
public static native void av_hex_dump(@Cast("FILE*") Pointer f, @Cast("const uint8_t*") BytePointer buf, int size);
public static native void av_hex_dump(@Cast("FILE*") Pointer f, @Cast("const uint8_t*") ByteBuffer buf, int size);
public static native void av_hex_dump(@Cast("FILE*") Pointer f, @Cast("const uint8_t*") byte[] buf, int size);

/**
 * Send a nice hexadecimal dump of a buffer to the log.
 *
 * @param avcl A pointer to an arbitrary struct of which the first field is a
 * pointer to an AVClass struct.
 * @param level The importance level of the message, lower values signifying
 * higher importance.
 * @param buf buffer
 * @param size buffer size
 *
 * @see av_hex_dump, av_pkt_dump2, av_pkt_dump_log2
 */
public static native void av_hex_dump_log(Pointer avcl, int level, @Cast("const uint8_t*") BytePointer buf, int size);
public static native void av_hex_dump_log(Pointer avcl, int level, @Cast("const uint8_t*") ByteBuffer buf, int size);
public static native void av_hex_dump_log(Pointer avcl, int level, @Cast("const uint8_t*") byte[] buf, int size);

/**
 * Send a nice dump of a packet to the specified file stream.
 *
 * @param f The file stream pointer where the dump should be sent to.
 * @param pkt packet to dump
 * @param dump_payload True if the payload must be displayed, too.
 * @param st AVStream that the packet belongs to
 */
public static native void av_pkt_dump2(@Cast("FILE*") Pointer f, @Const AVPacket pkt, int dump_payload, @Const AVStream st);


/**
 * Send a nice dump of a packet to the log.
 *
 * @param avcl A pointer to an arbitrary struct of which the first field is a
 * pointer to an AVClass struct.
 * @param level The importance level of the message, lower values signifying
 * higher importance.
 * @param pkt packet to dump
 * @param dump_payload True if the payload must be displayed, too.
 * @param st AVStream that the packet belongs to
 */
public static native void av_pkt_dump_log2(Pointer avcl, int level, @Const AVPacket pkt, int dump_payload,
                      @Const AVStream st);

/**
 * Get the AVCodecID for the given codec tag tag.
 * If no codec id is found returns AV_CODEC_ID_NONE.
 *
 * @param tags list of supported codec_id-codec_tag pairs, as stored
 * in AVInputFormat.codec_tag and AVOutputFormat.codec_tag
 * @param tag  codec tag to match to a codec ID
 */
public static native @Cast("AVCodecID") int av_codec_get_id(@Cast("const AVCodecTag*const*") PointerPointer tags, @Cast("unsigned int") int tag);
public static native @Cast("AVCodecID") int av_codec_get_id(@Const @ByPtrPtr AVCodecTag tags, @Cast("unsigned int") int tag);

/**
 * Get the codec tag for the given codec id id.
 * If no codec tag is found returns 0.
 *
 * @param tags list of supported codec_id-codec_tag pairs, as stored
 * in AVInputFormat.codec_tag and AVOutputFormat.codec_tag
 * @param id   codec ID to match to a codec tag
 */
public static native @Cast("unsigned int") int av_codec_get_tag(@Cast("const AVCodecTag*const*") PointerPointer tags, @Cast("AVCodecID") int id);
public static native @Cast("unsigned int") int av_codec_get_tag(@Const @ByPtrPtr AVCodecTag tags, @Cast("AVCodecID") int id);

/**
 * Get the codec tag for the given codec id.
 *
 * @param tags list of supported codec_id - codec_tag pairs, as stored
 * in AVInputFormat.codec_tag and AVOutputFormat.codec_tag
 * @param id codec id that should be searched for in the list
 * @param tag A pointer to the found tag
 * @return 0 if id was not found in tags, > 0 if it was found
 */
public static native int av_codec_get_tag2(@Cast("const AVCodecTag*const*") PointerPointer tags, @Cast("AVCodecID") int id,
                      @Cast("unsigned int*") IntPointer tag);
public static native int av_codec_get_tag2(@Const @ByPtrPtr AVCodecTag tags, @Cast("AVCodecID") int id,
                      @Cast("unsigned int*") IntPointer tag);
public static native int av_codec_get_tag2(@Const @ByPtrPtr AVCodecTag tags, @Cast("AVCodecID") int id,
                      @Cast("unsigned int*") IntBuffer tag);
public static native int av_codec_get_tag2(@Const @ByPtrPtr AVCodecTag tags, @Cast("AVCodecID") int id,
                      @Cast("unsigned int*") int[] tag);

public static native int av_find_default_stream_index(AVFormatContext s);

/**
 * Get the index for a specific timestamp.
 *
 * @param st        stream that the timestamp belongs to
 * @param timestamp timestamp to retrieve the index for
 * @param flags if AVSEEK_FLAG_BACKWARD then the returned index will correspond
 *                 to the timestamp which is <= the requested one, if backward
 *                 is 0, then it will be >=
 *              if AVSEEK_FLAG_ANY seek to any frame, only keyframes otherwise
 * @return < 0 if no such timestamp could be found
 */
public static native int av_index_search_timestamp(AVStream st, long timestamp, int flags);

/**
 * Add an index entry into a sorted list. Update the entry if the list
 * already contains it.
 *
 * @param timestamp timestamp in the time base of the given stream
 */
public static native int av_add_index_entry(AVStream st, long pos, long timestamp,
                       int size, int distance, int flags);


/**
 * Split a URL string into components.
 *
 * The pointers to buffers for storing individual components may be null,
 * in order to ignore that component. Buffers for components not found are
 * set to empty strings. If the port is not found, it is set to a negative
 * value.
 *
 * @param proto the buffer for the protocol
 * @param proto_size the size of the proto buffer
 * @param authorization the buffer for the authorization
 * @param authorization_size the size of the authorization buffer
 * @param hostname the buffer for the host name
 * @param hostname_size the size of the hostname buffer
 * @param port_ptr a pointer to store the port number in
 * @param path the buffer for the path
 * @param path_size the size of the path buffer
 * @param url the URL to split
 */
public static native void av_url_split(@Cast("char*") BytePointer proto,         int proto_size,
                  @Cast("char*") BytePointer authorization, int authorization_size,
                  @Cast("char*") BytePointer hostname,      int hostname_size,
                  IntPointer port_ptr,
                  @Cast("char*") BytePointer path,          int path_size,
                  @Cast("const char*") BytePointer url);
public static native void av_url_split(@Cast("char*") ByteBuffer proto,         int proto_size,
                  @Cast("char*") ByteBuffer authorization, int authorization_size,
                  @Cast("char*") ByteBuffer hostname,      int hostname_size,
                  IntBuffer port_ptr,
                  @Cast("char*") ByteBuffer path,          int path_size,
                  String url);
public static native void av_url_split(@Cast("char*") byte[] proto,         int proto_size,
                  @Cast("char*") byte[] authorization, int authorization_size,
                  @Cast("char*") byte[] hostname,      int hostname_size,
                  int[] port_ptr,
                  @Cast("char*") byte[] path,          int path_size,
                  @Cast("const char*") BytePointer url);
public static native void av_url_split(@Cast("char*") BytePointer proto,         int proto_size,
                  @Cast("char*") BytePointer authorization, int authorization_size,
                  @Cast("char*") BytePointer hostname,      int hostname_size,
                  IntPointer port_ptr,
                  @Cast("char*") BytePointer path,          int path_size,
                  String url);
public static native void av_url_split(@Cast("char*") ByteBuffer proto,         int proto_size,
                  @Cast("char*") ByteBuffer authorization, int authorization_size,
                  @Cast("char*") ByteBuffer hostname,      int hostname_size,
                  IntBuffer port_ptr,
                  @Cast("char*") ByteBuffer path,          int path_size,
                  @Cast("const char*") BytePointer url);
public static native void av_url_split(@Cast("char*") byte[] proto,         int proto_size,
                  @Cast("char*") byte[] authorization, int authorization_size,
                  @Cast("char*") byte[] hostname,      int hostname_size,
                  int[] port_ptr,
                  @Cast("char*") byte[] path,          int path_size,
                  String url);


/**
 * Print detailed information about the input or output format, such as
 * duration, bitrate, streams, container, programs, metadata, side data,
 * codec and time base.
 *
 * @param ic        the context to analyze
 * @param index     index of the stream to dump information about
 * @param url       the URL to print, such as source or destination file
 * @param is_output Select whether the specified context is an input(0) or output(1)
 */
public static native void av_dump_format(AVFormatContext ic,
                    int index,
                    @Cast("const char*") BytePointer url,
                    int is_output);
public static native void av_dump_format(AVFormatContext ic,
                    int index,
                    String url,
                    int is_output);

/**
 * Return in 'buf' the path with '%d' replaced by a number.
 *
 * Also handles the '%0nd' format where 'n' is the total number
 * of digits and '%%'.
 *
 * @param buf destination buffer
 * @param buf_size destination buffer size
 * @param path numbered sequence string
 * @param number frame number
 * @return 0 if OK, -1 on format error
 */
public static native int av_get_frame_filename(@Cast("char*") BytePointer buf, int buf_size,
                          @Cast("const char*") BytePointer path, int number);
public static native int av_get_frame_filename(@Cast("char*") ByteBuffer buf, int buf_size,
                          String path, int number);
public static native int av_get_frame_filename(@Cast("char*") byte[] buf, int buf_size,
                          @Cast("const char*") BytePointer path, int number);
public static native int av_get_frame_filename(@Cast("char*") BytePointer buf, int buf_size,
                          String path, int number);
public static native int av_get_frame_filename(@Cast("char*") ByteBuffer buf, int buf_size,
                          @Cast("const char*") BytePointer path, int number);
public static native int av_get_frame_filename(@Cast("char*") byte[] buf, int buf_size,
                          String path, int number);

/**
 * Check whether filename actually is a numbered sequence generator.
 *
 * @param filename possible numbered sequence string
 * @return 1 if a valid numbered sequence string, 0 otherwise
 */
public static native int av_filename_number_test(@Cast("const char*") BytePointer filename);
public static native int av_filename_number_test(String filename);

/**
 * Generate an SDP for an RTP session.
 *
 * Note, this overwrites the id values of AVStreams in the muxer contexts
 * for getting unique dynamic payload types.
 *
 * @param ac array of AVFormatContexts describing the RTP streams. If the
 *           array is composed by only one context, such context can contain
 *           multiple AVStreams (one AVStream per RTP stream). Otherwise,
 *           all the contexts in the array (an AVCodecContext per RTP stream)
 *           must contain only one AVStream.
 * @param n_files number of AVCodecContexts contained in ac
 * @param buf buffer where the SDP will be stored (must be allocated by
 *            the caller)
 * @param size the size of the buffer
 * @return 0 if OK, AVERROR_xxx on error
 */
public static native int av_sdp_create(@Cast("AVFormatContext**") PointerPointer ac, int n_files, @Cast("char*") BytePointer buf, int size);
public static native int av_sdp_create(@ByPtrPtr AVFormatContext ac, int n_files, @Cast("char*") BytePointer buf, int size);
public static native int av_sdp_create(@ByPtrPtr AVFormatContext ac, int n_files, @Cast("char*") ByteBuffer buf, int size);
public static native int av_sdp_create(@ByPtrPtr AVFormatContext ac, int n_files, @Cast("char*") byte[] buf, int size);

/**
 * Return a positive value if the given filename has one of the given
 * extensions, 0 otherwise.
 *
 * @param filename   file name to check against the given extensions
 * @param extensions a comma-separated list of filename extensions
 */
public static native int av_match_ext(@Cast("const char*") BytePointer filename, @Cast("const char*") BytePointer extensions);
public static native int av_match_ext(String filename, String extensions);

/**
 * Test if the given container can store a codec.
 *
 * @param ofmt           container to check for compatibility
 * @param codec_id       codec to potentially store in container
 * @param std_compliance standards compliance level, one of FF_COMPLIANCE_*
 *
 * @return 1 if codec with ID codec_id can be stored in ofmt, 0 if it cannot.
 *         A negative number if this information is not available.
 */
public static native int avformat_query_codec(@Const AVOutputFormat ofmt, @Cast("AVCodecID") int codec_id,
                         int std_compliance);

/**
 * \defgroup riff_fourcc RIFF FourCCs
 * \{
 * Get the tables mapping RIFF FourCCs to libavcodec AVCodecIDs. The tables are
 * meant to be passed to av_codec_get_id()/av_codec_get_tag() as in the
 * following code:
 * <pre>{@code
 * uint32_t tag = MKTAG('H', '2', '6', '4');
 * const struct AVCodecTag *table[] = { avformat_get_riff_video_tags(), 0 };
 * enum AVCodecID id = av_codec_get_id(table, tag);
 * }</pre>
 */
/**
 * @return the table mapping RIFF FourCCs for video to libavcodec AVCodecID.
 */
public static native @Const AVCodecTag avformat_get_riff_video_tags();
/**
 * @return the table mapping RIFF FourCCs for audio to AVCodecID.
 */
public static native @Const AVCodecTag avformat_get_riff_audio_tags();
/**
 * @return the table mapping MOV FourCCs for video to libavcodec AVCodecID.
 */
public static native @Const AVCodecTag avformat_get_mov_video_tags();
/**
 * @return the table mapping MOV FourCCs for audio to AVCodecID.
 */
public static native @Const AVCodecTag avformat_get_mov_audio_tags();

/**
 * \}
 */

/**
 * Guess the sample aspect ratio of a frame, based on both the stream and the
 * frame aspect ratio.
 *
 * Since the frame aspect ratio is set by the codec but the stream aspect ratio
 * is set by the demuxer, these two may not be equal. This function tries to
 * return the value that you should use if you would like to display the frame.
 *
 * Basic logic is to use the stream aspect ratio if it is set to something sane
 * otherwise use the frame aspect ratio. This way a container setting, which is
 * usually easy to modify can override the coded value in the frames.
 *
 * @param format the format context which the stream is part of
 * @param stream the stream which the frame is part of
 * @param frame the frame with the aspect ratio to be determined
 * @return the guessed (valid) sample_aspect_ratio, 0/1 if no idea
 */
public static native @ByVal AVRational av_guess_sample_aspect_ratio(AVFormatContext format, AVStream stream, AVFrame frame);

/**
 * Guess the frame rate, based on both the container and codec information.
 *
 * @param ctx the format context which the stream is part of
 * @param stream the stream which the frame is part of
 * @param frame the frame for which the frame rate should be determined, may be NULL
 * @return the guessed (valid) frame rate, 0/1 if no idea
 */
public static native @ByVal AVRational av_guess_frame_rate(AVFormatContext ctx, AVStream stream, AVFrame frame);

/**
 * Check if the stream st contained in s is matched by the stream specifier
 * spec.
 *
 * See the "stream specifiers" chapter in the documentation for the syntax
 * of spec.
 *
 * @return  >0 if st is matched by spec;
 *          0  if st is not matched by spec;
 *          AVERROR code if spec is invalid
 *
 * \note  A stream specifier can match several streams in the format.
 */
public static native int avformat_match_stream_specifier(AVFormatContext s, AVStream st,
                                    @Cast("const char*") BytePointer spec);
public static native int avformat_match_stream_specifier(AVFormatContext s, AVStream st,
                                    String spec);

public static native int avformat_queue_attached_pictures(AVFormatContext s);


/**
 * \}
 */

// #endif /* AVFORMAT_AVFORMAT_H */


}
